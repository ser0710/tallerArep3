package edu.escuelaing.arep.app;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
    private static ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<>();

    /**
     * Método que almacena una consulta a la API en caso
     * de que no se encuentre almacenado en el HashMap,
     * en caso dado que se encuentre consulta sobre este
     * @param url url de la API de la cual se va a consultar la información de las películas
     * @param name Nombre de la película buscada
     * @return Datos consultados de la película
     * @throws IOException
     */
    public static String cache(String url, String name) throws IOException {
        String urlToUse1 = "http://www.omdbapi.com/?t=";
        String urlToUse2 = "&apikey=18afbfbc";
        String urlFinal = urlToUse1 + url + urlToUse2;
        String valor = "";
        if(!cache.containsKey(name)){
            valor = HttpConnectionExample.answer(urlFinal);
            cache.put(name, valor);
        }else {
            valor = cache.get(name);
        }
//        System.out.println(cache.keySet());
        return valor;
    }

    /**
     * Método que retorna el tamaño del cache
     * @return entero que representa el tamaño del cache
     */
    public static int getNumKeys(){
        return cache.size();
    }

    /**
     * Elimina los datos del cache
     */
    public static void clean() {
        cache.clear();
    }
}
