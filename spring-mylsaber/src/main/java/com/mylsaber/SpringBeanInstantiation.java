package com.mylsaber;

import com.mylsaber.entity.UserBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jfw
 */
public class SpringBeanInstantiation {
	public static void main(String[] args) {
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		UserBean staticMethodBean = context.getBean("static-method-user", UserBean.class);
		UserBean factoryUser = context.getBean("factory-use", UserBean.class);
		UserBean factoryBean = context.getBean("factory-bean-user", UserBean.class);
		System.out.println();
	}
}
