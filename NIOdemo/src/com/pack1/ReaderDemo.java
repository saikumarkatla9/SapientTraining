package com.pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("sap1.txt");
		FileChannel fc =fis.getChannel();
		ByteBuffer bb = ByteBuffer.allocate(10);
		byte[] arr = null;
		while(fc.read(bb)!=-1){
			/*arr=new byte[bb.limit()];
			arr = bb.array();
			String str = new String(arr);
			System.out.println(str);*/
			
			
			//example of youtube buffering
			bb.flip(); //will keep the track of limit
			while(bb.hasRemaining()){
				
				System.out.print((char)bb.get());
			}
			bb.clear();
			bb.rewind(); //will not keep the track of limit
			
		}
		fc.close();

	}

}
