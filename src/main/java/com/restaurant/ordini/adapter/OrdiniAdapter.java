package com.restaurant.ordini.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class OrdiniAdapter {

    private final RestTemplate restTemplate;

    public <T> ResponseEntity<T> getOrdini() throws Exception {
        String url = "http://localhost:8082/locali/getLocali";
        Map<String, String> urlParams = new HashMap<>();
        HttpHeaders headers = createHeader();
        HttpEntity<T> requestEntity = new HttpEntity<>(null, headers);
        return (ResponseEntity<T>) invokeApi(url, HttpMethod.GET, requestEntity, new ParameterizedTypeReference<T>() {
        });
    }

    private <T> ResponseEntity<T> invokeApi(String url, HttpMethod method, @Nullable HttpEntity<?> requestEntity, ParameterizedTypeReference<T> responseType) throws Exception {
        String uriString = "";
        ResponseEntity<T> response = null;
        try {
            response = restTemplate.exchange(url, method, requestEntity, responseType);
        } catch (HttpStatusCodeException e) {
            throw new Exception(e);
        } catch (RestClientException e) {
            throw new Exception(e);
        }
        return response;
    }

    private HttpHeaders createHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}
