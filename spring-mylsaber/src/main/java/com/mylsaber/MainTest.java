package com.mylsaber;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author jfw
 */
public class MainTest {
	public static void main(String[] args) {
//		final FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("D:\\JavaLearn\\source-code\\spring-${jfw}.xml");
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-${username}.xml");
		final Object student = context.getBean("springBean");
		System.out.println(student);
	}
}
