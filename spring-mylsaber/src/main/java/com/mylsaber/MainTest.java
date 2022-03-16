package com.mylsaber;

import com.mylsaber.entity.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jfw
 */
public class MainTest {
	public static void main(String[] args) {
//		final FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("D:\\JavaLearn\\source-code\\spring-${jfw}.xml");
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-${username}.xml");
		final Student student = (Student) context.getBean("student");
		System.out.println(student.getName());
	}
}
