package com.sapient.client;

import com.sapient.service.Nokia1100;
import com.sapient.service.NokiaLumia;

public class NokiaClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NokiaLumia mobile = new NokiaLumia();
		Nokia1100 mobile2 = new NokiaLumia();
		mobile.doConverse();
		mobile.sendSms();
		
		System.out.println(mobile.price);
		/*mobile.browseInternet();
		mobile.captureImage();*/
		
		mobile2.doConverse();
		
	}

}
