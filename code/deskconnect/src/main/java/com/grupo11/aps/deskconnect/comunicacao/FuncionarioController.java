package com.grupo11.aps.deskconnect.comunicacao;

import com.grupo11.aps.deskconnect.negocio.Fachada;
import com.grupo11.aps.deskconnect.negocio.FuncionarioFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.grupo11.aps.deskconnect.negocio.Funcionario;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;

@Controller
public class FuncionarioController {

    @Autowired
    Fachada fachada;
    @RequestMapping("/novo_funcionario")
    public String mostrarFormulaioInserirFuncionario(Model model) {
        model.addAttribute("funcionario", new Funcionario());
        return "createFuncionario";
    }
    @PostMapping("/inserir_funcionario")
    public String inserirFuncionario(@ModelAttribute("funcionario") Funcionario funcionario, @RequestParam("employeeType") String employeeType) {
        FuncionarioFactory factory = new FuncionarioFactory();
        Funcionario createdFuncionario = factory.createFuncionario(employeeType,
                funcionario.getNome(),
                funcionario.getCpf(),
                funcionario.getFuncao(),
                funcionario.getSalario(),
                funcionario.getSetor()
        );
        fachada.inserirFuncionario(createdFuncionario);
        return "successPage";
    }

}
