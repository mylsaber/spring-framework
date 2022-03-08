package com.mylsaber.entity;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author jfw
 */
public class SpringBean implements InitializingBean {
	private String desc;
	private String remark;

	public SpringBean() {
		System.out.println("SpringBean构造方法");
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		System.out.println("SpringBean setDesc 方法");
		this.desc = desc;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		System.out.println("SpringBean setRemark 方法");
		this.remark = remark;
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println("调用afterPropertiesSet方法");
		this.desc = "在初始化方法中修改之后的描述信息";
	}

	public void initMethod() {
		System.out.println("SpringBean initMethod方法");
	}

	@Override
	public String toString() {
		return "SpringBean{" +
				"desc='" + desc + '\'' +
				", remark='" + remark + '\'' +
				'}';
	}
}
