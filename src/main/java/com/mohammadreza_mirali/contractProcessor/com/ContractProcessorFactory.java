package com.mohammadreza_mirali.contractProcessor.com;

import java.io.IOException;

/**
 * This class implements Factory pattern, we use this pattern to create new instance of our class dynamically from a propety file
 * this class is Singletone
 */
public class ContractProcessorFactory {
    /**
     * making Singletone
     */
    private static final ContractProcessorFactory instance = new ContractProcessorFactory();
    private ContractProcessorFactory() {
    }

    /**
     *
     * @return valid instance of this class
     */
    public static ContractProcessorFactory getInstance()
    {
        return instance;
    }

    public ContractProcessorStrategyInt createProcessContract(String type) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        return (ContractProcessorStrategyInt) Class.forName(getProperty(type)).newInstance();
    }

    /**
     *
     * @param propertyName is name of the property
     * @return value of the property
     * @throws IOException may be happened
     */
    private String getProperty(String propertyName) throws IOException {

        return PropertyUtil.getProperty(propertyName);
    }
}
