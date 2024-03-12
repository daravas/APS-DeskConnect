package com.grupo11.aps.deskconnect.negocio.observer;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EventManager {
  Map<String, List<String>> listeners = new HashMap<>();
  Notificacao notificacao = new Notificacao();
	
	public EventManager() {
    // limpeza, gerência, alimentação e hospedagem
    listeners.put("gerencia", Arrays.asList("123456", "234567", "345678"));
    listeners.put("limpeza", Arrays.asList("654321", "765432"));
    listeners.put("aliementacao", Arrays.asList("132546", "987655", "111111"));
    listeners.put("hospedagem", Arrays.asList("444444", "333333", "222222"));
  }

    public void subscribe(String eventType, String listener) {
        List<String> users = getEventList(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, String listener) {
        List<String> users = getEventList(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, String data) {
      List<String> users = getEventList(eventType);
        notificacao.notify(eventType, users);
    }
    
    private List<String> getEventList(String eventType){
    	listeners.putIfAbsent(eventType, new ArrayList<String>());
    	return listeners.get(eventType);
    }
}
