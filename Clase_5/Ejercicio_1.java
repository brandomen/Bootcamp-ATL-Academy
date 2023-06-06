package Clase_5;

import java.util.Scanner;
public class Ejercicio_1{
    public static void main(String[] args) {
        System.out.println("Ingrese la edad de su perro");
        Scanner edadPerro = new Scanner(System.in);
        int edadHumano = (edadPerro.nextInt())*7;
        System.out.println("Equivale a " + edadHumano + " años humanos");
    }
}
