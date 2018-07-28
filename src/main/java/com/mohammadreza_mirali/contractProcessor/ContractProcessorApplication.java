package com.mohammadreza_mirali.contractProcessor;

import com.mohammadreza_mirali.contractProcessor.com.ContractProcessorFactory;
import com.mohammadreza_mirali.contractProcessor.com.ContractProcessorProxyInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ContractProcessorApplication {


	static ContractProcessorFactory contractProcessorFactory = ContractProcessorFactory.getInstance();
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		SpringApplication.run(ContractProcessorApplication.class, args);
		ContractProcessorProxyInt contractProcessorProxyInt = contractProcessorFactory.createProcessContract("electricity");
		contractProcessorProxyInt.processContract();

	}
}
