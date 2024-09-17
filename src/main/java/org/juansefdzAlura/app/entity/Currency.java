package org.juansefdzAlura.app.entity;

public class Currency {

    private String currency;
    private String currencyName;
    private double value;

    public Currency(String currency, String currencyName, double value) {
        this.currency = currency;
        this.currencyName = currencyName;
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public double getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return "Moneda: " + currencyName + " (" + currency + "), Valor: " + value;
    }
}
