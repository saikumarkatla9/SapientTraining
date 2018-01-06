package com.pack1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("sap1.txt");
		FileChannel fc = fos.getChannel();
		
		ByteBuffer bb = ByteBuffer.allocate(1024);
		bb.put("sapient technology\n".getBytes());
		bb.put("sapient razorfish\n".getBytes());
		bb.flip();
		fc.write(bb);
		System.out.println("file created");
		fc.close();
	}

}
