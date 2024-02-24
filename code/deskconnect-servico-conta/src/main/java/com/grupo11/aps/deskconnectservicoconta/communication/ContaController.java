package com.grupo11.aps.deskconnectservicoconta.communication;

import com.grupo11.aps.deskconnectservicoconta.model.Conta;
import com.grupo11.aps.deskconnectservicoconta.model.ContaCollection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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

    @GetMapping("/nova_conta")
    public String mostrarFormularioInserir(@ModelAttribute("conta") Conta conta) {
        return "inserir";
    }

    @PostMapping("/inserir")
    public String inserir(@ModelAttribute("conta") Conta conta) {
        contaCollection.inserir(conta);
        return "redirect:/contas";
    }
}
