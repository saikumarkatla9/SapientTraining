
//channel transfer demo
package com.pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class TransferDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fromFile = new FileInputStream("sap1.txt");
		FileChannel      fromChannel = fromFile.getChannel();

		FileOutputStream toFile = new FileOutputStream("sap2.txt");
		FileChannel      toChannel = toFile.getChannel();

		long position = 0;
		long count    = fromChannel.size();

		//toChannel.transferFrom(fromChannel, position, count);
		fromChannel.transferTo(position, count, toChannel);
		System.out.println("file transfered");

	}

}
