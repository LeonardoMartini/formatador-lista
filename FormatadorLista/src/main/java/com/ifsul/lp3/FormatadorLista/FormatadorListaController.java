package com.ifsul.lp3.FormatadorLista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/lista")
public class FormatadorListaController {

    @Autowired
    private FormatadorListaService formatadorListaService;

    @GetMapping("/sem-repetidas")
    public List<String> removerPalavrasRepetidas(@RequestParam(name = "palavras") List<String> palavras) {
        return formatadorListaService.removerPalavrasRepetidas(palavras);
    }

    @GetMapping("/crescente")
    public List<String> ordenarCrescente(@RequestParam(name = "palavras") List<String> palavras) {
        return formatadorListaService.ordenarCrescente(palavras);
    }

    @GetMapping("/decrescente")
    public List<String> ordenarDecrescente(@RequestParam(name = "palavras") List<String> palavras) {
        return formatadorListaService.ordenarDecrescente(palavras);
    }

    @GetMapping("/repetidas")
    public Integer contarPalavrasRepetidas(@RequestParam(name = "palavras") List<String> palavras) {
        return formatadorListaService.contarPalavrasRepetidas(palavras);
    }

    @GetMapping("/maiusculas")
    public List<String> todasMaiusculas(@RequestParam(name = "palavras") List<String> palavras) {
        return formatadorListaService.converterTodasMaiusculas(palavras);
    }

    @GetMapping("/minusculas")
    public List<String> todasMinusculas(@RequestParam(name = "palavras") List<String> palavras) {
        return formatadorListaService.converterTodasMinusculas(palavras);
    }

    @GetMapping("/invertida")
    public List<String> inverterLista(@RequestParam(name = "palavras") List<String> palavras) {
        return formatadorListaService.inverterLista(palavras);
    }

    @GetMapping("/inicial-maiuscula")
    public List<String> inicialMaiuscula(@RequestParam(name = "palavras") List<String> palavras) {
        return formatadorListaService.converterInicialMaiuscula(palavras);
    }

}
