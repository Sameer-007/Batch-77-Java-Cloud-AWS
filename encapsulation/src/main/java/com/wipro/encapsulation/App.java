package com.wipro.encapsulation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("ABC");
        employee1.setMobile(8787878);
        employee1.setAadhar("sdsd22323");
        employee1.setCompany("Wipro");
        
        Address home1=new Address();
        home1.setHouseNo(111);
        home1.setStreetName("ABC");
        home1.setCity("Chennai");
        home1.setPincode(600000);
        
        employee1.setAddress(home1);
        System.out.println("Employee 1 Details");
        employee1.display();
        
        System.out.println("Employee 2 Details");
        Address home2=new Address(115, "Anna Nagar", "Krishnagiri", 635112);
        
        Employee employee2=new Employee(101, "Karthick", "123456", 9566259956l,"Wipro", home2);
        employee2.display();
        
        		
        
    }
}
