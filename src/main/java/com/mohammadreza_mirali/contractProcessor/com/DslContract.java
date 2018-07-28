package com.mohammadreza_mirali.contractProcessor.com;

public class DslContract implements ContractProcessorProxyInt {
    @Override
    public void processContract() {
        System.out.println("Processed dsl");
    }
}
