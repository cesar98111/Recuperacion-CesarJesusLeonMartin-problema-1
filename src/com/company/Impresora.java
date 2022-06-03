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

        cola.enqueque(trabajo);

    }
    public void verListaDeTrabajos (){

        System.out.println(cola);

    }

}
