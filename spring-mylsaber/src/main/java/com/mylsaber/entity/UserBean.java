package com.mylsaber.entity;

/**
 * @author jfw
 */
public class UserBean {

	private String name;
	private Integer age;

	public static UserBean createInstance() {
		UserBean userBean = new UserBean();
		userBean.setAge(18);
		userBean.setName("zhangsan");

		return userBean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserBean{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
