package com.grupo11.aps.deskconnectservicofuncionario.communication;

import com.grupo11.aps.deskconnectservicofuncionario.model.FuncionarioFactory;
import com.grupo11.aps.deskconnectservicofuncionario.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FuncionarioController {

    @Autowired
    Funcionario funcionario;

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
        //fachada.inserirFuncionario(createdFuncionario);
        return "successPage";
    }

}
