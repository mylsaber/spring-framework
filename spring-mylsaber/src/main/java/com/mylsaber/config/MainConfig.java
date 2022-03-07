package com.mylsaber.config;

import com.mylsaber.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jfw
 */
@Configuration
@ComponentScan("com.mylsaber")
public class MainConfig {

	@Bean
	public Student student() {
		return new Student(1, "姜迪");
	}
}
