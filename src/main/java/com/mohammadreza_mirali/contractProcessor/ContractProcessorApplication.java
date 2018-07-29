package com.mohammadreza_mirali.contractProcessor;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.core.joran.spi.JoranException;
import com.mohammadreza_mirali.contractProcessor.com.ContractProcessorFactory;
import com.mohammadreza_mirali.contractProcessor.com.ContractProcessorProxyInt;
import com.mohammadreza_mirali.contractProcessor.com.PropertyUtil;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class ContractProcessorApplication {


	static ContractProcessorFactory contractProcessorFactory = ContractProcessorFactory.getInstance();
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, JoranException {
//		SpringApplication.run(ContractProcessorApplication.class, args);
//		new SpringApplicationBuilder(ContractProcessorApplication.class)
//				.logStartupInfo(false)
//				.run(args);
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter which type of contracts you want to be processed (Enter E for exit): ");
			System.out.println(PropertyUtil.getProperty());
			String type = scanner.next();
			try {
				if(type.equalsIgnoreCase("E"))
					break;
				ContractProcessorProxyInt contractProcessorProxyInt = contractProcessorFactory.createProcessContract(type);
				contractProcessorProxyInt.processContract();
			} catch (Exception e) {
				System.out.println("A problem is happened, may be you entered wrong character");
			}
		}
	}
}
