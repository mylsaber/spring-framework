package com.mylsaber;

import com.mylsaber.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jfw
 */
public class MainTest {
	public static void main(String[] args) {
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		final Object student = context.getBean("student");
		System.out.println(student);
	}
}
