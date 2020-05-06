package ana.zurabashvili.weather;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Client{
    public static String get(String endpoint) throws Exception {
        URL url = new URL(String.format("http://localhost:8080/ana_zurabashvili_davaleba1_war_exploded/api/%s", endpoint));
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");

        if (connection.getResponseCode() != 200) {
            throw new RuntimeException(String.format("Failed... HTTP error code: %s", connection.getResponseCode()));
        }

        BufferedReader bf = new BufferedReader(new InputStreamReader((connection.getInputStream())));

        String output;
        StringBuilder result = new StringBuilder();

        while ((output = bf.readLine()) != null) {
            result.append(output);
        }

        connection.disconnect();

        return result.toString();
    }
}
