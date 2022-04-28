package com.wipro.abstraction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
    	//Cannot instantiate the type Parivahan
    	//Cannot create an object for interface
        //Parivahan parivahan=new Parivahan();
    	
    	Karnataka karnataka=new Karnataka();
    	karnataka.photoIdentity();
    	
    	Kerala kerala=new Kerala();
    	//kerala.feeForLisence=400;
    	kerala.photoIdentity();
    	
    }
}
