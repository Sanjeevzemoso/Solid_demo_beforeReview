package com.solid;

import com.solid.Principles.*;

class Main {

    public static void main(String[] args) {

        SingleResponsibilityPrinciple singleResponsibilityPrinciple = new SingleResponsibilityPrinciple();
        singleResponsibilityPrinciple.run();

        OpenClosePrinciple openClosePrinciple = new OpenClosePrinciple();
        openClosePrinciple.run();

        LiskovSubstitution liskovSubstitution = new LiskovSubstitution();
        liskovSubstitution.run();

        InterfaceSegregationPrinciple interfaceSegregationPrinciple = new InterfaceSegregationPrinciple();
        interfaceSegregationPrinciple.run();

        DependencyInversionPrinciple dependencyInversionPrinciple = new DependencyInversionPrinciple();
        dependencyInversionPrinciple.run();

    }
}