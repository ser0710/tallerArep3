package edu.escuelaing.arep.app.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Web404 implements Services{

    @Override
    public String head() {
        return "HTTP/1.1 404 not Found \r\n" +
                "Content-Type: text/html \r\n" +
                "\r\n";
    }

    @Override
    public String body() {
        byte[] file;
        try{
            file = Files.readAllBytes(Paths.get("src/main/resources/404.html"));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return new String(file);
    }
}
