package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class FileWriterExemplo {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("teste-writer.txt");
        FileWriter writer = new FileWriter(path.toFile());
        writer.write("Escrever dentro do arquivo atraves do writer");
        writer.close();
    }
}
