package com.sapient.client;

import com.sapient.service.Palindrome;
import com.sapient.service.PalindromeBuffer;

public class Client {

	public static void main(String[] args){
		/*Palindrome obj = new Palindrome();
		obj.checkPalindrome("rama");*/
		
		String[] arr = {"amar","nitin","satyam","maom"};
		PalindromeBuffer buff = new PalindromeBuffer(new Palindrome());
		buff.checkPalindrome(arr);
	}
}
