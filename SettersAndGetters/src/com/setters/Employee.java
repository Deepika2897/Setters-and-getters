package com.setters;

public class Employee {
	private int id;
	private String name;
	private double salary;
	public Employee()
	{
		
	}
	//setter methods
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//methods
	public void getEmployeeInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args)
	{
		Employee employee = new Employee();
		//USE SETTER METHODS TO ASSIGN VALUES TO THE VARIABLES
		employee.setId(6758);
		employee.setName("DEEPIKA");
		employee.setSalary(96788.87);
		
		employee.getEmployeeInfo();
		
	}
		
	
	}


	