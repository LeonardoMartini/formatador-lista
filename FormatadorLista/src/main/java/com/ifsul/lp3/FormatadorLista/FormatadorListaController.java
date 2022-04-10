package com.ifsul.lp3.FormatadorLista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formatador-lista")
public class FormatadorListaController {

    @Autowired
    private FormatadorListaService formatadorListaService;

    @GetMapping("/remover-palavras-repetidas")
    @ResponseStatus(HttpStatus.OK)
    public List<String> removerPalavrasRepetidas(
            @RequestParam(name = "listaPalavras") List<String> listaPalavras
    ) {
        return formatadorListaService.removerPalavrasRepetidas(listaPalavras);
    }

    @GetMapping("/ordenar-crescente")
    @ResponseStatus(HttpStatus.OK)
    public List<String> ordenarCrescente(
            @RequestParam(name = "listaPalavras") List<String> listaPalavras
    ) {
        return formatadorListaService.ordenarCrescente(listaPalavras);
    }

    @GetMapping("/ordenar-decrescente")
    @ResponseStatus(HttpStatus.OK)
    public List<String> ordenarDecrescente(
            @RequestParam(name = "listaPalavras") List<String> listaPalavras
    ) {
        return formatadorListaService.ordenarDecrescente(listaPalavras);
    }

    @GetMapping("/contar-palavras-repetidas")
    @ResponseStatus(HttpStatus.OK)
    public Integer contarPalavrasRepetidas(
            @RequestParam(name = "listaPalavras") List<String> listaPalavras
    ) {
        return formatadorListaService.contarPalavrasRepetidas(listaPalavras);
    }

    @GetMapping("/todas-maiusculas")
    @ResponseStatus(HttpStatus.OK)
    public List<String> todasMaiusculas(
            @RequestParam(name = "listaPalavras") List<String> listaPalavras
    ) {
        return formatadorListaService.todasMaiusculas(listaPalavras);
    }

    @GetMapping("/todas-minusculas")
    @ResponseStatus(HttpStatus.OK)
    public List<String> todasMinusculas(
            @RequestParam(name = "listaPalavras") List<String> listaPalavras
    ) {
        return formatadorListaService.todasMinusculas(listaPalavras);
    }

    @GetMapping("/inverter-lista")
    @ResponseStatus(HttpStatus.OK)
    public List<String> inverterLista(
            @RequestParam(name = "listaPalavras") List<String> listaPalavras
    ) {
        return formatadorListaService.inverterLista(listaPalavras);
    }

    @GetMapping("/inicial-maiuscula")
    @ResponseStatus(HttpStatus.OK)
    public List<String> inicialMaiuscula(
            @RequestParam(name = "listaPalavras") List<String> listaPalavras
    ) {
        return formatadorListaService.inicialMaiuscula(listaPalavras);
    }

}
