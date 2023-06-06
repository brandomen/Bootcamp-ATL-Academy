package Clase_5;

import java.util.Scanner;
public class Ejercicio_2 {
public static void main(String[] args){
    Scanner millas = new Scanner(System.in);
    System.out.println("Ingrese una distancia en millas: ");
    double kilometros = (millas.nextInt())*1.60934;
    System.out.println("La distancia en kilómetros será: " + kilometros);
}
}
