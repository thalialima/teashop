package br.com.alura.teashop.http;

import java.util.Map;

public interface HttpAdapter {
    void post(String url, Map<String, Object> date);

}
