package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;

public class OutputExemplo {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("teste-saida.txt");
        String textoDentroArquivo = "Ola meu primeiro texto dentro do arquivo";
        OutputStream outputStream = new FileOutputStream(path.toFile());
        outputStream.write(textoDentroArquivo.getBytes());
        outputStream.close();
    }
}
