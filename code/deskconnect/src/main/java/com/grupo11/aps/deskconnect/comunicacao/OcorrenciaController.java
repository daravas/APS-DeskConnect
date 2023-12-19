package com.grupo11.aps.deskconnect.comunicacao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.grupo11.aps.deskconnect.negocio.Fachada;
import com.grupo11.aps.deskconnect.negocio.Ocorrencia;

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

    @GetMapping("/criarOcorrencia")
     public String criarOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        fachada.inserirOcorrencia(ocorrencia);
        return "newOcorrencia";
    }

    @GetMapping("/getOcorrencia")
    public String criarOcorrencia() {
        return "newOcorrencia";
    }
}
