package edu.escuelaing.arep.app.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WebCss implements Services{
    @Override
    public String head() {
        return "HTTP/1.1 200 \r\n" +
                "Content-Type: text/css \r\n" +
                "\r\n";
    }

    @Override
    public String body() {
        byte[] file;
        try{
            file = Files.readAllBytes(Paths.get("src/main/resources/style.css"));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return new String(file);
    }
}
