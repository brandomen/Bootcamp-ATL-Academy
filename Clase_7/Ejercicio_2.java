package Clase_7;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        /*Programa que permite ingresar 5 números y que muestre el mayor y  el menor*/
        Scanner palabra = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números que desea trabajar:");
        int cantidaddeNumeros = numeros.nextInt();
        int mayor = 0;
        int menor = 0;
        int [] arreglo = new int[cantidaddeNumeros];

        for (int i = 0; i < cantidaddeNumeros; i++) {
            System.out.println("Introduce el número: ");
            int numero = palabra.nextInt();
            arreglo[i] = numero;
            }

        for (int i = 0; i < cantidaddeNumeros; i++) {
            //Hallar el mayor número
            if (arreglo[i] >= mayor) {
                mayor = arreglo[i];
            }
        }


        int aleatorio = mayor;
        for (int i = 0; i < cantidaddeNumeros; i++) {
            //Hallar el menor número
            if (arreglo[i] < aleatorio) {
                aleatorio = arreglo[i];
                menor = aleatorio;
            }
        }

        //Mostrar los resultados
        System.out.println("El mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);


        }
    }
