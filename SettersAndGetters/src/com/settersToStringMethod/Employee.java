package com.settersToStringMethod;

public class Employee 

	{
		
		private int id;
		private String name;
		private double salary;
		
		public Employee() 
		{
			// TODO Auto-generated constructor stub
		}

		//setter methods
		public void setId(int id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setSalary(double salary) 
		{
			this.salary = salary;
		}	
		
		//toString method
		@Override
		public String toString() 
		{
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
		
		public static void main(String[] args) 
		{
			
			Employee employee = new Employee();
			
			//use setter methods to assign values to the variables		
			employee.setId(9896);
			employee.setName("KAVINESH");
			employee.setSalary(94887.88);
			
			System.out.println(employee.toString());
			
			//System.out.println(employee);
			
		}

		

	}


