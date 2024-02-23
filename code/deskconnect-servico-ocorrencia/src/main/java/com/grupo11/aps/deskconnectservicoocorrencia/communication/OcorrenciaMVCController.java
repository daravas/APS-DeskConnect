package com.grupo11.aps.deskconnectservicoocorrencia.communication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.grupo11.aps.deskconnectservicoocorrencia.model.Ocorrencia;
import com.grupo11.aps.deskconnectservicoocorrencia.model.OcorrenciaController;

import java.util.List;

@Controller
public class OcorrenciaMVCController {
    @Autowired private OcorrenciaController ocorrenciaController;

    @RequestMapping("/ocorrencia")
    public String ocorrencia(@RequestParam(name="descricao", required=false) String descricao, Model model) {
        model.addAttribute("descricao", descricao);

        //List<Ocorrencia> ocorrencias = fachada.getOcorrencias();
        //model.addAttribute("ocorrencias", ocorrencias);

        return "historicoOcorrencias";
    }

    @RequestMapping("/nova_ocorrencia")
    public String mostrarFormularioInserirOcorrencia(@ModelAttribute("ocorrencia") Ocorrencia ocorrencia) {
        return "inserir_ocorrencia";
    }

    @PostMapping("/inserir_ocorrencia")
     public String inserir_ocorrencia(@ModelAttribute("ocorrencia") Ocorrencia ocorrencia) {
        //fachada.inserirOcorrencia(ocorrencia);
        return "redirect:/ocorrencia";
    }
}
