package com.mohammadreza_mirali.contractProcessor.com;

/**
 * strategy is ElectricityContract
 */
public class ElectricityContract implements ContractProcessorStrategyInt {
    /**
     * logic of the strategy
     */
    @Override
    public void processContract() {
        System.out.println("Processed electricity");
    }
}
