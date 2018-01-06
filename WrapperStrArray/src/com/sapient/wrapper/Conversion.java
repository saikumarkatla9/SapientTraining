//convert int to bin,oct,hex
package com.sapient.wrapper;

public class Conversion {

	public static void main(String[] args) {
		int dec = 45;
		System.out.println("Binary: "+Integer.toBinaryString(dec));
		System.out.println("Binary: "+Integer.toOctalString(dec));
		System.out.println("Binary: "+Integer.toHexString(dec));
		

	}

}
