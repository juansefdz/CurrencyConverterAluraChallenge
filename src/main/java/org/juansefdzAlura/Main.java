package org.juansefdzAlura;

import java.util.Scanner;

import org.juansefdzAlura.app.Api.ExchangerateApi;
import org.juansefdzAlura.app.enums.CurrencyValues;
import org.juansefdzAlura.app.entity.Currency;

public class Main {
    public static void main(String[] args) {
        ExchangerateApi exchangerateApi = new ExchangerateApi();
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Bienvenido al conversor de monedas!");
        System.out.println("Elija la moneda que desee Convertir: ");
        
        for (CurrencyValues currency : CurrencyValues.values()) {
            System.out.println(currency.ordinal() + 1 + ". " + currency.getName() + " (" + currency.getCode() + ")");
        }

        int fromIndex = scanner.nextInt() - 1;
        CurrencyValues fromCurrency = CurrencyValues.values()[fromIndex];

        System.out.println("Elija a que valor desea convertirlo:");
        for (CurrencyValues currency : CurrencyValues.values()) {
            System.out.println(currency.ordinal() + 1 + ". " + currency.getName() + " (" + currency.getCode() + ")");
        }

        int toIndex = scanner.nextInt() - 1;
        CurrencyValues toCurrency = CurrencyValues.values()[toIndex];

        System.out.println("Ingrese la cantidad en " + fromCurrency.getName() + " que desea convertir a " +toCurrency.getName()+ ":");
        double amount = scanner.nextDouble();

        // Convierte la moneda
        Currency convertedCurrency = exchangerateApi.exchangeCurrency(fromCurrency, toCurrency, amount);

        System.out.println("Resultado de la conversión: " + amount + " " + fromCurrency.getCode() + " es igual a "
                + convertedCurrency.getAmount() + " " + toCurrency.getCode());

        scanner.close();
    
    }

}
