package org.juansefdzAlura.app.Api;

import io.github.cdimascio.dotenv.Dotenv;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.juansefdzAlura.app.entity.Currency;
import org.juansefdzAlura.app.enums.CurrencyValues;

public class ExchangerateApi {
    public Currency exchangeCurrency(CurrencyValues currency) {

        Dotenv dotenv = Dotenv.load();
        String apiKey = dotenv.get("APIKEY");

        try {
            URI uri = new URI("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + currency.getCode());

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonResponse = new Gson().fromJson(response.body(), JsonObject.class);

            System.out.println("Respuesta de la API: " + jsonResponse);

            double exchangeRate = jsonResponse.getAsJsonObject("conversion_rates").get("USD").getAsDouble();

            return new Currency(currency.getCode(), currency.getName(), exchangeRate);

        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la tasa de cambio: " + e.getMessage());
        }
    }
}
