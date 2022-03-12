package com.mylsaber.beanfactory;

import com.mylsaber.entity.UserBean;

/**
 * @author jfw
 */
public interface UserBeanFactory {
	/**
	 * 获取 UserBean 工厂方法
	 * @return
	 */
	UserBean factory();
}
