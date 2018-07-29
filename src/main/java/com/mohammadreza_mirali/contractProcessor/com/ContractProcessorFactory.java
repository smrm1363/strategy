package com.mohammadreza_mirali.contractProcessor.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ContractProcessorFactory {
    private static final ContractProcessorFactory instance = new ContractProcessorFactory();
    private ContractProcessorFactory() {
    }

    public static ContractProcessorFactory getInstance()
    {
        return instance;
    }

    public ContractProcessorProxyInt createProcessContract(String type) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        return (ContractProcessorProxyInt) Class.forName(getProperty(type)).newInstance();
    }


    private String getProperty(String propertyName) throws IOException {

//        String resourceName = "contract_process.properties";
//        ClassLoader loader = Thread.currentThread().getContextClassLoader();
//        Properties props = new Properties();
//        try(InputStream resourceStream = loader.getResourceAsStream(resourceName)) {
//            props.load(resourceStream);}

        return PropertyUtil.getProperty(propertyName);
    }
}
