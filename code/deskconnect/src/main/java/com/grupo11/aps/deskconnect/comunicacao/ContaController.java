package com.grupo11.aps.deskconnect.comunicacao;

import com.grupo11.aps.deskconnect.negocio.Conta;
import com.grupo11.aps.deskconnect.negocio.Fachada;
import com.grupo11.aps.deskconnect.negocio.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class ContaController {

    @RequestMapping("/conta")
    public String conta(@RequestParam(name="name", required=false) String name, Model model) {
        model.addAttribute("name", name);

        List<Conta> contas = fachada.getContas();
        model.addAttribute("contas", contas);

        return "conta";
    }

    @RequestMapping("/login")
    public String fazerLogin(){
        return "login";
    }

    @Autowired
    Fachada fachada;

    @RequestMapping("/nova_conta")
    public String mostrarFormularioInserir(@ModelAttribute("conta") Conta conta) {
        return "inserir";
    }

    @PostMapping("/inserir")
    public String inserir(@ModelAttribute("conta") Conta conta) {
        fachada.inserirConta(conta);
        return "redirect:/conta";
    }
}
