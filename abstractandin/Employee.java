package com.bigacademe.handsforjava.abstractandin;

public abstract class Employee {
	int empno;
	String ename;
	
	public abstract void jobs();
	public abstract void timings();
	
	public void noticePeriod() {
		System.out.println("Notice period is 2 months");
	}

}
