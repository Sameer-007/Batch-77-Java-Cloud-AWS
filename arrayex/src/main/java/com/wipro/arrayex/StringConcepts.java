package com.wipro.arrayex;

public class StringConcepts {

	public static void main(String[] args) {
		
		// Two ways to declare string
		
		String cityOne=new String("Kolkata");
		
		String cityTwo=new String("Kolkata");
		
		// String Constant Pool
		
		String cityThree="Kolkata";
		String cityFour="Kolkata";
		// == it will check only reference / address
		System.out.println(cityOne==cityTwo); // 3000 == 2000 // false
		
		System.out.println(cityTwo==cityThree); // 2000 == 1000 // false
		
		System.out.println(cityThree==cityFour); // 1000 == 1000 // true
		
		
		String str="Wipro Technologies";
		System.out.println(str.replace("Wipro","Cognizant"));
		
		
		String message="Welcome to Java Program";
		String[] arr=message.split(" "); // {"Welcome","to","Java","Program"}
		for (String string : arr) {
			System.out.println(string);
		}
		
		String emp="101,Siva k,9566248867,45000.00,Wipro";
		String[] siva=emp.split(",");
		for (String string : siva) {
			System.out.println(string);
		}
		
		
		
		
		
		
		
	}
	
	
}
