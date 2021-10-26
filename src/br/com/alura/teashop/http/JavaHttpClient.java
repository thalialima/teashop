package br.com.alura.teashop.http;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> date) {
        try {
            URL apiUrl = new URL(url);
            URLConnection connection = apiUrl.openConnection();
            connection.connect();
        } catch (Exception e) {
           throw new RuntimeException("Error", e);
        }
    }
}
