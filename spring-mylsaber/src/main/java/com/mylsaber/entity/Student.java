package com.mylsaber.entity;

/**
 * @author jfw
 */
public class Student {
	private Integer id;
	private String name;
	private SpringBean springBean;

	public SpringBean getSpringBean() {
		return springBean;
	}

	public void setSpringBean(SpringBean springBean) {
		this.springBean = springBean;
	}

	public Student() {
	}

	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
