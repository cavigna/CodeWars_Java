package com.nacho.kyu7;

import java.util.HashMap;

public class InteractiveDictionary {
    public String palabra, definicion;
    private HashMap<String, String> diccionario = new HashMap<>();
    public  InteractiveDictionary(){
        this.palabra = palabra;
        this.definicion = definicion;
        // your code
        //String palabra, String definicion
    }

    public void newEntry(String key, String value){
        this.palabra = key;
        this.definicion = value;
        diccionario.put(this.palabra,this.definicion);
    }

    public String look(String key){
        return diccionario.containsKey(key) ? diccionario.get(key):
                "Cant find entry for " +key;

    }
}
/*
public class Dictionary {
    public Dictionary(){
        // your code
    }

    public void newEntry(String key, String value){
        // your code
    }

    public String look(String key){
        // your code
    }
}
**/