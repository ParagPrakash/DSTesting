package com.demo;

public class Employee 
{
	int id;
	String name;
	 public Employee(int id,String name)
	 {
		 this.id=id;
		 this.name=name;
	 }
	public static void main(String[] args) 
	{
		Employee e=new Employee(100,"Savani");
		System.out.println(e.id);
		System.out.println(e.name);
		e.m1();

	}
	public void m1()
	{
		System.out.println("M1");
	}	

}
