package com.grupo11.aps.deskconnectservicoocorrencia.model;

import org.springframework.stereotype.Service;

@Service
public class ControladorRequisicaoChatgpt {
    private ChatModelAdapter chatModelAdapter;

    public ControladorRequisicaoChatgpt(ChatModelAdapter chatModelAdapter) {
        this.chatModelAdapter = chatModelAdapter;
    }

    public void gpt() {
        String prompt = "";

        // Completing the request using the adapter
        String response = chatModelAdapter.completeRequest(prompt);

        if (response != null) {
            System.out.println("Response received: " + response);
            // Process the response as needed
        }
    }
}
