package com.modules.screenmatch2.principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void mostrarEjemplo(){
        List<String> nombres = Arrays.asList("Brenda", "Luis", "Maria Fernanda", "Eric", "Genesys");
        nombres.stream()
                .sorted()
                .limit(3)
                .filter(n -> n.startsWith("G"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);
    }
}
