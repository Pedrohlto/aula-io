package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class InputExemplo {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("teste-saida.txt");
        InputStream input = new FileInputStream(path.toFile());
        byte[] buffer = new byte[500];
        int data;
        while((data = input.read(buffer)) != -1){
            for(int i = 0; i < data; i++){
                System.out.print((char) buffer[i]);
            }
        }

//        while(data != -1){
//            System.out.print((char) data);
//            data = input.read();
//        }
        input.close();
    }
}
