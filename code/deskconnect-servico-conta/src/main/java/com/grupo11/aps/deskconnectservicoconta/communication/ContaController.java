package com.grupo11.aps.deskconnectservicoconta.communication;

import com.grupo11.aps.deskconnectservicoconta.model.Conta;
import com.grupo11.aps.deskconnectservicoconta.model.ContaCollection;

import jakarta.websocket.server.PathParam;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class ContaController {

    @Autowired
    private ContaCollection contaCollection;

    @GetMapping("/contas")
    public String conta(@RequestParam(name="name", required=false) String name, Model model) {
        model.addAttribute("name", name);

        List<Conta> contas = contaCollection.getContas();
        model.addAttribute("contas", contas);

        return "conta";
    }

    @GetMapping("/login")
    public String fazerLogin(){
        return "login";
    }

    // endpoint para comunicacao com outros servicos
    @GetMapping("/logged/{id}")
    public ResponseEntity<Map<String, Boolean>> isLogged(@PathVariable Long id) {
        return ResponseEntity.ok().body(Collections.singletonMap("logged", contaCollection.isLogged(id)));
    }

    @GetMapping("/nova_conta")
    public String mostrarFormularioInserir(@ModelAttribute("conta") Conta conta) {
        return "inserir";
    }

    @PostMapping("/inserir")
    public String inserir(@ModelAttribute("conta") Conta conta) {
        contaCollection.inserir(conta);
        return "redirect:/contas";
    }

    @PostMapping("/logar")
    public String logar(@ModelAttribute("conta") Conta conta) {
        contaCollection.logar(conta);
        return "redirect:/contas";
    }

    @GetMapping("/loggedusers")
    public ResponseEntity<List<Long>> loggedUsers() {
        return ResponseEntity.ok().body(
            contaCollection
            .getContas()
            .stream()
            .filter(conta -> conta.getLogado())
            .map(conta -> conta.getId())
            .collect(Collectors.toList()));
    }
}
