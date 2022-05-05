package com.wipro.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// Read from file Wipro.txt
		// IOStreams - Byte Stream / Character Streams
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		fileReader = new FileReader("input.txt");
		bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();
		System.out.println(line);
		String output="";
		String[] split = line.split(",");
		for (String string : split) {
			 output= output + string.substring(0,1).toUpperCase() + string.substring(1, string.length()).toLowerCase() + ",";
		}
		System.out.println(output);
    	while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();
		// output.txt file will be created if file not exists
		FileWriter fileWriter = new FileWriter("output.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		//String msg = "\nByte Streams handle I/O of raw binary data\nBuffered Streams optimize input and output by reducing the number of calls";
		bufferedWriter.write(output);
		System.out.println("Check output.txt");
		bufferedWriter.close();

//			String line1 = bufferedReader.readLine();
//			String line2 = bufferedReader.readLine();
//			String line3= bufferedReader.readLine();
//			String line4 = bufferedReader.readLine();
//			System.out.println(line1);
//			System.out.println(line2);
//			System.out.println(line3);
//			System.out.println(line4);

	}

}
