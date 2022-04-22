package com.wipro.customer;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// Binary Operators a+b
		// Unary Operators a++ ++a => Increment Operators
		// a++ > increment a by 1 a=a+1
		// PostIncrement
		int a = 10;
		int c = a++ + 10;
		// 1.c=a+10
		// 2.a=a+1
		System.out.println(c); //
		System.out.println(a); // 11

		int b = 100;
		// PreIncrement
		int z = ++b + 100;
		// 1.b=b+1=> 100+1 = 101
		// 2.z=101+100 > 201
		System.out.println(z); // 101
		System.out.println(b); // 10

		// Ternary Operator ? :
		int x = 100, y = 200;
		int great = x > y ? x : y;
		System.out.println(great);
		String res = x > y ? x + " is greater" : y + " is greater";
		System.out.println(res);

		// Bitwise Operator & | ^

		for (int i = 0, j = 0; i < 10; i++, j++) {

		}

		while ("conditon will checked at first" == null) {
			// body of loop
		}

		do {
			System.out.println("Will be execute atleast once");

		} while (false); // condition is checked at last

		System.out.println("-------------------");
		for (int i = 0; i < 10; i++) { // 10<10
			if (i > 5) { // 6>5
				continue;
			}
			System.out.println(i);
		}
		// static final this super
	

	}
}
