package com.mohammadreza_mirali.contractProcessor.com;

/**
 * Strategy is DslContract
 */
public class DslContract implements ContractProcessorStrategyInt {
    /**
     * logic of the strategy
     */
    @Override
    public void processContract() {
        System.out.println("Processed dsl");
    }
}
