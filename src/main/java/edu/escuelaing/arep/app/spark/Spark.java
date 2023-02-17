package edu.escuelaing.arep.app.spark;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Spark {

    public static Map<String, Response> cache = new HashMap<>();

    public static void get(final String path, final Route route) {
        Request req = new Request();
        Response res = new Response();
        String s = route.handle(req, res);
        res.setBody(s);
        res.setPath(path);
        cache.put(path, res);
    }


    public static void setCache(String path) {
        Response res = new Response();
        byte[] file;
        String type;
        try{
            file = Files.readAllBytes(Paths.get("src/main/resources" + path));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        type = path.split("\\.")[1];
        String s = new String(file);
        res.setBody(s);
        if(Objects.equals(type, "js")){
            type = "javascript";
        }
        res.setType("text/" + type);
        cache.put(path, res);
    }

    public static String post(String path, String query){
        Response res = new Response();
        String llave = query.split("=")[0];
        String val = query.split("=")[1];
        String s = "{" + llave + ":" + val + "}";
        res.setBody(s);
        res.setType("application/json");
        cache.put(path, res);
        return res.getResponse();
    }
}
