package com.ifsul.lp3.FormatadorLista;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

@Service
public class FormatadorListaService {

    public List<String> removerPalavrasRepetidas(List<String> listaPalavras) {
        return listaPalavras.stream().distinct().collect(Collectors.toList());
    }

    public List<String> ordenarCrescente(List<String> listaPalavras) {
        return listaPalavras.stream().sorted().collect(Collectors.toList());
    }

    public List<String> ordenarDecrescente(List<String> listaPalavras) {
        List<String> listaPalavrasInvertida = listaPalavras.stream().sorted().collect(Collectors.toList());
        Collections.reverse(listaPalavrasInvertida);
        return listaPalavrasInvertida;
    }

    public Integer contarPalavrasRepetidas(List<String> listaPalavras) {
        return 1;
    }

    public List<String> todasMaiusculas(List<String> listaPalavras) {
        return listaPalavras.stream().map(palavra -> palavra.toUpperCase()).collect(Collectors.toList());
    }

    public List<String> todasMinusculas(List<String> listaPalavras) {
        return listaPalavras.stream().map(palavra -> palavra.toLowerCase()).collect(Collectors.toList());
    }

    public List<String> inverterLista(List<String> listaPalavras) {
        Collections.reverse(listaPalavras);
        return listaPalavras;
    }

    public List<String> inicialMaiuscula(List<String> listaPalavras) {
        listaPalavras.stream().map(palavra -> palavra.toLowerCase()).collect(Collectors.toList());
        List<String> listaPalavrasComInicialMaiuscula = new ArrayList<>();
        for (int i = 0; i < listaPalavras.size(); i++) {
            char[] palavra = listaPalavras.get(i).toCharArray();
            Character primeiraLetra = palavra[0];
            String letraMaiuscula = primeiraLetra.toString().toUpperCase();
            palavra[0] = letraMaiuscula.charAt(0);
            String palavraComInicialMaiuscula = "";
            for (int c = 0; c < palavra.length; c++) {
                palavraComInicialMaiuscula+=palavra[c];
            }
            listaPalavrasComInicialMaiuscula.add(palavraComInicialMaiuscula);
        }
        return listaPalavrasComInicialMaiuscula;
    }

}
