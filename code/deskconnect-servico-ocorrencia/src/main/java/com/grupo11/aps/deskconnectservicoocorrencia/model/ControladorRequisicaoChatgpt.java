package com.grupo11.aps.deskconnectservicoocorrencia.model;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ControladorRequisicaoChatgpt {

    private static final String OPENAI_API_KEY = "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";
    private static final String OPENAI_API_URL = "https://api.openai.com/v1/completions";

    public void gpt() {
        String prompt = ""; // prompt aqui

        // Configurando o cabeçalho da solicitação
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + OPENAI_API_KEY);

        // Construindo o corpo da solicitação
        String requestBody = "{\"model\": \"text-davinci-002\", \"prompt\": \"" + prompt + "\", \"max_tokens\": 50}";
        // String requestBody2 = getMessageChatGPT(prompt); // TODO: implementar adapter

        // Configurando a entidade da solicitação
        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        // Criando um RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Enviando a solicitação
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                OPENAI_API_URL,
                HttpMethod.POST,
                entity,
                String.class
        );

        // Verificando o status da resposta
        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            String resposta = responseEntity.getBody();
            System.out.println("Resposta recebida: " + resposta);
            // Aqui você pode processar a resposta conforme necessário
        } else {
            System.err.println("Falha ao enviar a solicitação: " + responseEntity.getStatusCode());
        }
    }
}
