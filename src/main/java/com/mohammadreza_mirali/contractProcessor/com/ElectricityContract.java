package com.mohammadreza_mirali.contractProcessor.com;

public class ElectricityContract implements ContractProcessorProxyInt {
    @Override
    public void processContract() {
        System.out.println("Processed electricity");
    }
}
