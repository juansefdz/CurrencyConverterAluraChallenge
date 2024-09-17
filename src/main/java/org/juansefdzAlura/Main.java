package org.juansefdzAlura;

import org.juansefdzAlura.app.Api.ExchangerateApi;
import org.juansefdzAlura.app.enums.CurrencyValues;
import org.juansefdzAlura.app.entity.Currency;

public class Main {
    public static void main(String[] args) {
        ExchangerateApi api = new ExchangerateApi();
        Currency result = api.exchangeCurrency(CurrencyValues.DOLAR);
        System.out.println(result);
    }
}
