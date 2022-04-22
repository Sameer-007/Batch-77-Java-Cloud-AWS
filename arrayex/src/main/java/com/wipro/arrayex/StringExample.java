package com.wipro.arrayex;

public class StringExample {

	public static void main(String[] args) {

		// Group of characters enclosed within double quotes
		// 0123456789 <-
		String company = "WiPro Cognizant";

		System.out.println("My Company " + company);
		// String is Immutable
		// String Methods

		int size = company.length();
		System.out.println("Length of String " + size); // index => 0 to size-1

		String lower = company.toLowerCase();
		System.out.println(lower);

		String upper = company.toUpperCase();
		System.out.println(upper);

		String str = company + " Technologies";
		System.out.println(str);

		String str1 = company.concat(" Limited");
		System.out.println(str1);

		char ch = company.charAt(company.length() - 1); // last character
		System.out.println(ch);

		String str3 = company.substring(0, 3); // 0 1 2 (3-1)
		System.out.println(" ---SubString--- " + str3);

		boolean status = company.contains("P");
		if (status) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}

		boolean x = company.equals("wipro"); // Wipro - wipro
		System.out.println(x);
		System.out.println("Wipro".equals("wipro"));

		boolean y = company.equalsIgnoreCase("wipro");
		System.out.println(y);

		int index = company.indexOf("o");
		System.out.println("Index of o " + index);
		System.out.println("Last Index of o " + company.lastIndexOf("o"));

		// split method / matches

		System.out.println(company); //

		String code = "Welcome to Java String Class and id is   123$#@";
		int vowelCount = 0, upperCount = 0, specialCount = 0;
		for (int i = 0; i < code.length(); i++) {

			if (code.charAt(i) == 'a' || code.charAt(i) == 'e' || code.charAt(i) == 'o') {
				vowelCount++;
			} else if (code.charAt(i) >= 'A' && code.charAt(i) <= 'Z') {
				upperCount++;
			} else {
				specialCount++;
			}

		}
		System.out.println("VowelCount " + vowelCount);

		// Count number of vowels / upper case / lower case / digits / special charters
		// in string

		// Take 15 min solve

	}

}
