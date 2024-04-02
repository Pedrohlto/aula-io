package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FileReaderExemplo {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("teste-saida.txt");
//        FileReader reader = new FileReader(path.toFile());
//        int valor = reader.read();
//        while(valor != -1 ){
//            System.out.print((char) valor);
//            valor = reader.read();
//        }
//        reader.close();

        Stream<String> lines = Files.lines(path);

        lines.forEach(valor -> System.out.println(valor));

    }
}
