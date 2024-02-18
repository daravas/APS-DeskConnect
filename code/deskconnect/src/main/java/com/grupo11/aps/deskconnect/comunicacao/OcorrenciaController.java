package com.grupo11.aps.deskconnect.comunicacao;

import com.grupo11.aps.deskconnect.negocio.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.grupo11.aps.deskconnect.negocio.Fachada;
import com.grupo11.aps.deskconnect.negocio.Ocorrencia;

import java.util.List;

@Controller
public class OcorrenciaController {
    private final Fachada fachada;

    public OcorrenciaController(Fachada fachada) {
        this.fachada = fachada;
    }

   // @GetMapping("/historico")
   // public String listaOcorrencias(Model model){
   //     List<Ocorrencia> ocorrencias = fachada.listaOcorrencias();
   //     model.addAttribute("ocorrencias", ocorrencias);
   //     return "historicoOcorrencias";
   //  }

    @RequestMapping("/ocorrencia")
    public String ocorrencia(@RequestParam(name="descricao", required=false) String descricao, Model model) {
        model.addAttribute("descricao", descricao);

        List<Ocorrencia> ocorrencias = fachada.getOcorrencias();
        model.addAttribute("ocorrencias", ocorrencias);

        return "historicoOcorrencias";
    }

    @RequestMapping("/nova_ocorrencia")
    public String mostrarFormularioInserirOcorrencia(@ModelAttribute("ocorrencia") Ocorrencia ocorrencia) {
        return "inserir_ocorrencia";
    }

    @PostMapping("/inserir_ocorrencia")
     public String inserir_ocorrencia(@ModelAttribute("ocorrencia") Ocorrencia ocorrencia) {
        fachada.inserirOcorrencia(ocorrencia);
        return "redirect:/ocorrencia";
    }

    //@GetMapping("/getOcorrencia")
    //public String criarOcorrencia() {
     //   return "newOcorrencia";
    //}

    @GetMapping("/")
    public String home() {
        return "newOcorrenciaVoz";
    }
}
