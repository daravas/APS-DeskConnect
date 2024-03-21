package com.grupo11.aps.deskconnectservicoocorrencia.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Listener {

  private Map<Long, Boolean> usuariosLogados = new HashMap<>();

  @Autowired
  private RestTemplate restTemplate;

  @Value("${services.conta}")
  private String address;

  public Listener() {

    try {
      String url = address + ":8082/loggedusers";

      ResponseEntity<List<Long>> response = restTemplate.exchange(
          url,
          HttpMethod.GET,
          null,
          new ParameterizedTypeReference<List<Long>>() {
          });

      for (Long id : response.getBody()) {
        usuariosLogados.put(id, true);
      }

    } catch (Exception e) {
      log.error(e.getMessage());
    }
  }

  @RabbitListener(queues = "LoginQueue")
  public void recieveMessage(Long id) throws JsonProcessingException {
    log.info("Recieving message with data: " + id);
    usuariosLogados.put(id, true);
  }

  public Boolean isLogged(Long id) {
    return usuariosLogados.get(id) != null ? true : false;
  }

}