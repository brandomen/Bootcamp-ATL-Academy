package Clase_7;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner palabra = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números que desea trabajar:");
        int cantidaddeNumeros = numeros.nextInt();
        double sum = 0;

        //Sumatoria de todos los números ingresados por el usuario
        for (int i = 0; i < cantidaddeNumeros; i++) {
            System.out.println("Introduce el número: ");
            int numero = palabra.nextInt();
            sum += numero;
        }

        //Hallando el promedio final
        double promedio = sum / cantidaddeNumeros;
        System.out.println("El promedio será: " + promedio);
    }
}
