package com.mylsaber.aspect;

/**
 * @author jfw
 */
public class LogAspect {
	public void before() {
		System.out.println("logBefore");
	}

	public void after() {
		System.out.println("logAfter");
	}
}
