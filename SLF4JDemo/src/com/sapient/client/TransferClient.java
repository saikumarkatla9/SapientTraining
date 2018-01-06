package com.sapient.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.exceptions.BalanceException;
import com.sapient.exceptions.IdException;
import com.sapient.service.ISer;
import com.sapient.service.SerImpl;

public class TransferClient {
private static Logger logger = LoggerFactory.getLogger("sapient");

	public static void main(String[] args) {
		logger.trace("main thread Starts");
		ISer ser = new SerImpl();
		logger.debug("Service Instance Created");

		try {
			logger.info("Transfer the ammount rs.5000 from 1001 to 1002");
			ser.transferFund(1001, 1002, 5000);
			logger.info("Successfully Transfer");
		} catch (IdException | BalanceException e) {
			logger.error(e.getMessage(), e);
		} 
	try {
			logger.info("Transfer the ammount rs.5000 from 1003 to 1002");

			ser.transferFund(1003, 1002, 5000);
			logger.info("Successfully Transfer");

		} catch (IdException | BalanceException e) {
			logger.error(e.getMessage(), e);

		}
		try {
			logger.info("Transfer the ammount rs.5000 from 2001 to 1002");
			ser.transferFund(2001, 1002, 5000);
			logger.info("Successfully Transfer");

		} catch (IdException | BalanceException e) {
			logger.error(e.getMessage(), e);

		}

	} 
}