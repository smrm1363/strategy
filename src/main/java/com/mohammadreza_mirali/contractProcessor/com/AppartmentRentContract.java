package com.mohammadreza_mirali.contractProcessor.com;

public class AppartmentRentContract implements ContractProcessorProxyInt {
    @Override
    public void processContract() {
        System.out.println("Processed appartment");
    }
}
