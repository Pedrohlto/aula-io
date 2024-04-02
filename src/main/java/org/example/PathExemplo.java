package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class PathExemplo {

    public static void main(String[] args) throws IOException {
        Path caminho = Path.of("C:\\Users\\Pedro Henrique\\Documents\\git\\aulas\\tecnicas-programacao-I\\arquivos-exemplo");
        Path caminhoSeparada = Path.of("C:", "Users", "Pedro Henrique");
//        System.out.println(caminho);
//        System.out.println(caminhoSeparada);
        var caminhoResolve = caminhoSeparada.resolve("outraPasta");
//        System.out.println(caminhoSeparada.getFileName());
//        System.out.println(caminhoSeparada.isAbsolute());
//        System.out.println(caminhoSeparada.getParent());
//        System.out.println(caminhoSeparada.resolve("outraPasta"));

//        File file = new File("");

//        System.out.println(Files.exists(caminhoResolve));
//        System.out.println(Files.getLastModifiedTime(caminho));

        Stream<Path> walk = Files.walk(caminho);
        walk.forEach((valor) -> System.out.println(valor));

    }
}
