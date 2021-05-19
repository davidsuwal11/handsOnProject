package com.bigacademe.handsforjava.abstractandin;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj;

		obj=new Programmer();
		obj.jobs();
		obj=new Analyst();
		obj.jobs();

		obj=new Manager();
		obj.jobs();

	}

}
