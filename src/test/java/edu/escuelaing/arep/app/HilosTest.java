package edu.escuelaing.arep.app;

import java.io.IOException;

public class HilosTest extends Thread {

    String urlFinal;
    String name;
    String answer;
    public HilosTest(String url, String n){
        this.urlFinal = url;
        this.name = n;
    }

    @Override
    public void run(){
        try {
            answer = Cache.cache(urlFinal, name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getAnswer(){
        return answer;
    }
}
