package com.grupo11.aps.deskconnectservicoocorrencia.model;

import org.springframework.stereotype.Service;

@Service
public class ControladorRequisicaoLLM {
    private ChatModelAdapter chatModelAdapter;

    public ControladorRequisicaoLLM(ChatModelAdapter chatModelAdapter) {
        this.chatModelAdapter = chatModelAdapter;
    }

    public void llm() {
        String prompt = "";

        // Completing the request using the adapter
        String response = chatModelAdapter.completeRequest(prompt);

        if (response != null) {
            System.out.println("Response received: " + response);
            // Process the response as needed
        }
    }
}
