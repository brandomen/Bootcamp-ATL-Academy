package Clase_7;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            Scanner palabra = new Scanner(System.in);
            System.out.println("Introduce el número: ");
            int numero = palabra.nextInt();
            numeros[i] = numero;
        }
        System.out.println("Los números digitados son: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]);
            System.out.print(" ");
        }




    }
}
