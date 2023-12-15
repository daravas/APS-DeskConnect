package com.grupo11.aps.deskconnect.negocio;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ControladorRequisicaoChatgpt {
    @Value("${openai.api.key}")
    private final String chatGPTApiKey = "your-api-key";
    private final String chatGPTApiUrl = "https://api.example.com/chatgpt";

    private final RestTemplate restTemplate = new RestTemplate();

    public String sendMessage(String message) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + chatGPTApiKey);

        HttpEntity<String> requestEntity = new HttpEntity<>(message, headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                chatGPTApiUrl,
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        return responseEntity.getBody();
    }
}
