package com.grupo11.aps.deskconnectservicofuncionario.communication;

import com.grupo11.aps.deskconnectservicofuncionario.model.Funcionario;
import com.grupo11.aps.deskconnectservicofuncionario.model.FuncionarioController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FuncionarioMVCController {

    @Autowired
    private FuncionarioController funcionarioController;

    @GetMapping("/novo_funcionario")
    public String mostrarFormulaioInserirFuncionario(@ModelAttribute("funcionario") Funcionario funcionario) {
        return "createFuncionario";
    }

    @PostMapping("/inserir_funcionario")
    public String inserirFuncionario(@ModelAttribute("funcionario") Funcionario funcionario, @RequestParam("employeeType") String employeeType) {
        funcionarioController.inserir(funcionario);
        return "successPage";
    }

}
