package com.company;

import java.util.ArrayList;

public class Queque <T> {
    private ArrayList<T> lista = new ArrayList<T>();

    public void enqueque (T elemento){

        lista.add(elemento);

    }

    public T dequeque (){

        return lista.remove(0);

    }

    @Override
    public String toString() {
        String cadena="";
        for (int i = 0; i < lista.size(); i++) {
            cadena += "| "+ lista.get(i) + " |";
        }
        return cadena;
    }
}
