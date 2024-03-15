package com.grupo11.aps.deskconnectservicoocorrencia.model;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChatGPTAdapter implements ChatModelAdapter {
    
    private static final String OPENAI_API_KEY = "";
    private static final String OPENAI_API_URL = "https://api.openai.com/v1/completions";
    private static final String MODEL_NAME = "text-davinci-002";
    private RestTemplate restTemplate;

    public ChatGPTAdapter() {
        this.restTemplate = new RestTemplate();
    }

    @Override
    public String completeRequest(String prompt) {
        // Configuring the request headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + OPENAI_API_KEY);

        // Building the request body
        String requestBody = "{\"model\": \"" + MODEL_NAME + "\", \"prompt\": \"" + prompt + "\", \"max_tokens\": 50}";

        // Configuring the request entity
        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        // Sending the request
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                OPENAI_API_URL,
                HttpMethod.POST,
                entity,
                String.class
        );

        // Verifying the response status
        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            return responseEntity.getBody();
        } else {
            System.err.println("Failed to send request: " + responseEntity.getStatusCode());
            return null;
        }
    }
}
