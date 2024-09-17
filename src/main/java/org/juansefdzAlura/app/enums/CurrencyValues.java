package org.juansefdzAlura.app.enums;

public enum CurrencyValues {
    DOLAR("USD", "$", "Dólar estadounidense"),
    EURO("EUR", "€", "Euro"),
    REAL("BRL", "R$", "Real brasileño"),
    PESO("COP", "$", "Peso colombiano");

    private String code;
    private String symbol;
    private String name;

    CurrencyValues(String code, String symbol, String name) {
        this.code = code;
        this.symbol = symbol;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}
