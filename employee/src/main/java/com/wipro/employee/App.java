package com.wipro.employee;


public class App 
{
    public static void main( String[] args )
    {
        
    	// Constructor  - default constructor  
    	Employee employee=new Employee();
    	employee.displayEmployeeDetails();
//    	System.out.println(employee.id);  // 0
//    	System.out.println(employee.name); // null
//    	System.out.println(employee.salary); // 0.0
//    	System.out.println(employee.company); // null
    	
    	// Parameterized Constructor
    	Employee employee2=new Employee(102,"Siva",35000,"Cognizant");
    	employee2.displayEmployeeDetails();
//    	System.out.println(employee2.id);
//    	System.out.println(employee2.name); // null
//    	System.out.println(employee2.salary); // 0.0
//    	System.out.println(employee2.company); // null
    	
    	
    	// Getter and Setter Method
    	
    	
    	
    	
    }
}
