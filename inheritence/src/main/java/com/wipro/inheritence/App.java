package com.wipro.inheritence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        College college=new College();
        //college.getDeptNo();
        
        Department department=new Department();
        department.setColCode(1120);
        department.setColName("ABC");
        department.setAddress("Krishnagiri");
        department.setContactNo(956625);
        department.setEmail("abc@abc.com");
        department.setDeptId(1);
        department.setDeptName("CSE");
        department.setNoOfStudents(120);
        department.setNoOfLabs(10);
        
        department.showDetails();
        
       
        
        
        
        
    }
}
