package com.mohammadreza_mirali.contractProcessor.com;

/**
 * Strategy is AppartmentRentContract
 */
public class AppartmentRentContract implements ContractProcessorStrategyInt {
    /**
     * logic of the strategy
     */
    @Override
    public void processContract() {
        System.out.println("Processed appartment");
    }
}
