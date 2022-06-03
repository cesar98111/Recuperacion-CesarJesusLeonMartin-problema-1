package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        Impresora miImpresora = new Impresora();

        while (opcion != 6){
            System.out.println(" 1. Encender impresora ");
            System.out.println(" 2. Apagar impresora ");
            System.out.println(" 3. Añadir trabajo ");
            System.out.println(" 4. Ver lista de trabajos");
            System.out.println(" 5 Imprimir");
            System.out.println(" 6. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){

                case 1:

                    miImpresora.encenderImpresora();

                    break;
                case 2:

                    miImpresora.apagarImresora();

                    break;
                case 3:

                    String nombre;
                    String tamaño;

                    System.out.println("introduce el nombre del trabajo");

                    nombre=sc.nextLine();

                    System.out.println("introduce el tamaño");

                    tamaño = sc.nextLine();

                    miImpresora.añadirTrabajos(new Documento(nombre,tamaño));

                    break;
                case 4:

                    miImpresora.verListaDeTrabajos();

                    break;

                case 5:

                    miImpresora.imprimir();

                    break;
            }



        }
    }
}
