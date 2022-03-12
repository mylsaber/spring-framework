package com.mylsaber.beanfactory;

import com.mylsaber.entity.UserBean;
import org.springframework.beans.factory.FactoryBean;

/**
 * 使用 FactoryBean 方式实现
 * @author jfw
 */
public class UserFactoryBean implements FactoryBean<UserBean> {
	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public UserBean getObject() throws Exception {
		return UserBean.createInstance();
	}

	@Override
	public Class<?> getObjectType() {
		return UserBean.class;
	}
}
