package com.wipro.test;

import com.wipro.encapsulation.Employee;

public class TestApp 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee();
        /*employee.id=101;
        employee.name="Vijay";
        employee.aadhar="1234567";
        employee.mobile=21212121;
        employee.company="Wipro"; */
        
        employee.setId(1);
        employee.setName("ABC");
        employee.setMobile(8787878);
        employee.setAadhar("sdsd22323");
        employee.setCompany("Wipro");
        
        employee.display();
        
        		
        
    }
}
