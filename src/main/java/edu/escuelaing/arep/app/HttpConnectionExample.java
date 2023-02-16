package edu.escuelaing.arep.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConnectionExample {

    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "http://www.omdbapi.com/?i=tt3896198&apikey=18afbfbc";

    /**
     * Método que permite hacer peticiones get a la API
     * @param urlToUse Url con el nombre de la película a consultar
     * @return String que contiene la respuesta por parte de la API
     * @throws IOException
     */
    public static String answer(String urlToUse) throws IOException {
        StringBuffer response = null;
        URL obj = new URL(urlToUse);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        }
        return response.toString();
    }

}
