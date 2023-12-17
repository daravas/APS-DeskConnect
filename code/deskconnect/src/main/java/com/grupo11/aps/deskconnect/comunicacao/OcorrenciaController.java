package com.grupo11.aps.deskconnect.comunicacao;

import com.grupo11.aps.deskconnect.negocio.Ocorrencia;
import com.grupo11.aps.deskconnect.negocio.Fachada;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OcorrenciaController {
    private final Fachada fachada;

    public OcorrenciaController(Fachada fachada) {
        this.fachada = fachada;
    }
    @GetMapping("/historico")
    public String listaOcorrencias(Model model){
        List<Ocorrencia> ocorrencias = fachada.listaOcorrencias();
        model.addAttribute("ocorrencias", ocorrencias);
        return "historicoOcorrencias";
    }

}
