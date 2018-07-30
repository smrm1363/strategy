package com.mohammadreza_mirali.contractProcessor;

import ch.qos.logback.core.joran.spi.JoranException;
import com.mohammadreza_mirali.contractProcessor.com.ContractProcessorFactory;
import com.mohammadreza_mirali.contractProcessor.com.ContractProcessorStrategyInt;
import com.mohammadreza_mirali.contractProcessor.com.PropertyUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class ContractProcessorApplication {

	/**
	 * This is our factory, by using Factory pattern and Strategy pattern I tried to separate logics of each contract type
	 */
	static ContractProcessorFactory contractProcessorFactory = ContractProcessorFactory.getInstance();
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, JoranException {

		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter which type of contracts you want to be processed (Enter E for exit): ");
			System.out.println(PropertyUtil.getProperty());
			String type = scanner.next();
			try {
				if(type.equalsIgnoreCase("E"))
					break;
				ContractProcessorStrategyInt contractProcessorStrategyInt = contractProcessorFactory.createProcessContract(type);
				contractProcessorStrategyInt.processContract();
			} catch (Exception e) {
				System.out.println("A problem is happened, may be you entered wrong character");
			}
		}
	}
}
