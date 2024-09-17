package org.juansefdzAlura.app.entity;

public class Currency {

    private String currency;
    private String currencyName;
    private double amount;

    public Currency(String currency, String currencyName, double amount) {
        this.currency = currency;
        this.currencyName = currencyName;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Moneda: " + currencyName + " (" + currency + "), Cantidad: " + amount;
    }
}
