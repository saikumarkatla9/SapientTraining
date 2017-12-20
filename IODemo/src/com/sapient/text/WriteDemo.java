package com.sapient.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw  =new FileWriter("sap.txt");
		BufferedWriter bw =new BufferedWriter(fw);
		
		bw.write("sapient razorfish training is held in gurugram\n");
		bw.write("sapient clients are ferrari,audi\n");
		bw.close();
		fw.close();
		System.out.println("file created.");

	}

}
