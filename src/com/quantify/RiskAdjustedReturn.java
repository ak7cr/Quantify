package com.quantify;

public class RiskAdjustedReturn {

    public static double calculate(double portfolioReturn, double portfolioRisk) {
        return portfolioReturn / portfolioRisk;
    }
}
