package com.mylsaber;

import com.mylsaber.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author jfw
 */
public class MainTest {
	public static void main(String[] args) {
		final FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("D:\\JavaLearn\\source-code\\spring.xml");
		final Object student = context.getBean("student");
		System.out.println(student);
	}
}
