package com.ifsul.lp3.FormatadorLista;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FormatadorListaService {

    public List<String> removerPalavrasRepetidas(List<String> palavras) {
        palavras = formatarLista(palavras);
        return palavras.stream().distinct().collect(Collectors.toList());
    }

    public List<String> ordenarCrescente(List<String> palavras) {
        palavras = formatarLista(palavras);
        return palavras.stream().sorted().collect(Collectors.toList());
    }

    public List<String> ordenarDecrescente(List<String> palavras) {
        palavras = formatarLista(palavras);
        List<String> palavrasInvertidas = palavras.stream().sorted().collect(Collectors.toList());
        Collections.reverse(palavrasInvertidas);
        return palavrasInvertidas;
    }

    public Integer contarPalavrasRepetidas(List<String> palavras) {
        palavras = formatarLista(palavras);
        Map<String, Long> palavrasAgrupadas = palavras.stream()
                .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));
        return Math.toIntExact(palavrasAgrupadas.values().stream()
                .filter(palavra -> palavra > 1)
                .reduce(Long.valueOf(0), Long::sum));
    }

    public List<String> converterTodasMaiusculas(List<String> palavras) {
        palavras = formatarLista(palavras);
        return palavras.stream().map(palavra -> palavra.toUpperCase()).collect(Collectors.toList());
    }

    public List<String> converterTodasMinusculas(List<String> palavras) {
        palavras = formatarLista(palavras);
        return palavras.stream().map(palavra -> palavra.toLowerCase()).collect(Collectors.toList());
    }

    public List<String> inverterLista(List<String> palavras) {
        palavras = formatarLista(palavras);
        Collections.reverse(palavras);
        return palavras;
    }

    public List<String> converterInicialMaiuscula(List<String> palavras) {
        palavras = formatarLista(palavras);
        return palavras.stream().map(palavra -> {
            char[] letras = palavra.toCharArray();
            letras[0] = Character.toUpperCase(letras[0]);
            return new String(letras);
        }).collect(Collectors.toList());
    }

    private List<String> formatarLista(List<String> palavras) {
        return palavras.stream().map(palavra -> palavra.trim()).collect(Collectors.toList());
    }

}
