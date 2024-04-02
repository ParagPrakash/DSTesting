package com.demo;

public class Employee 
{
	int id;
	String name;
	String cname;
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
		e.m2();

	}
	public void m1()
	{
		System.out.println("M1");
	}
	public void m2()
	{
		System.out.println("M2");
	}
	public void m3()
	{
		System.out.println("M3");
	}
	public void m4()
	{
		System.out.println("M4");
	}
	public void m5()
	{
		System.out.println("M5");
	}
	public void login()
	{
		System.out.println("Login");
	}	
	
	

}
