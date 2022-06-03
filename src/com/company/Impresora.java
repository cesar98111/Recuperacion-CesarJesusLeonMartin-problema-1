package com.company;

import java.util.ArrayList;

public class Impresora {

    private boolean estado;
    private Queque <Documento> cola = new Queque <Documento>();

    public Impresora (){
        estado = false;
    }

    public void encenderImpresora(){

        estado = true;

    }

    public void apagarImresora(){

        estado = false;

    }

    public void añadirTrabajos (Documento trabajo){

        if(estado){
            cola.enqueque(trabajo);
        }else{
            System.out.println("apagado");
        }


    }
    public void verListaDeTrabajos (){

        if (estado){
            System.out.println(cola);
        }else{
            System.out.println("apagado");
        }


    }

    public void imprimir (){
        if (estado){
            System.out.println(cola.dequeque());
        }else{
            System.out.println("apagado");
        }
    }


}
