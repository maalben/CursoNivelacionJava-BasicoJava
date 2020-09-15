package main;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        //Instancia de una clase
        Scanner teclado = new Scanner(System.in);

        //Definición y asignación de variables.
        System.out.println("Ingrese el largo de la caja");
        double largo = teclado.nextDouble();

        System.out.println("Ingrese el ancho de la caja");
        double ancho = teclado.nextDouble();

        System.out.println("Ingrese el alto de la caja");
        double alto = teclado.nextDouble();
        double volumen;

        //Cálculo de acuerdo al requerimiento solicitado
        volumen = largo * ancho * alto;

        //Mostrar el resultado del cálculo anterior
        System.out.println("El volumen de la caja es: " + volumen);
        System.out.println("Mensaje");
    }
}
