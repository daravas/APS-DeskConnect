package com.grupo11.aps.deskconnect.comunicacao;

import com.grupo11.aps.deskconnect.negocio.Conta;
import com.grupo11.aps.deskconnect.negocio.Fachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContaController {

    @RequestMapping("/conta")
    public String contasIndex(@RequestParam(name="name", required=false) String name, Model model) {
        model.addAttribute("name", name);
        return "inserir";
    }

    @RequestMapping("/login")
    public String fazerLogin(){
        return "login";
    }

    @Autowired
    Fachada fachada;

    @PostMapping("/inserir")
    public void inserir(Conta conta) {
        fachada.inserirConta(conta);
    }
}
