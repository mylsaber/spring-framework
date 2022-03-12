package com.mylsaber.beanfactory;

import com.mylsaber.entity.UserBean;

/**
 * @author jfw
 */
public class UserBeanFactoryImpl implements UserBeanFactory{
	@Override
	public UserBean factory() {
		return UserBean.createInstance();
	}
}
