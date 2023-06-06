package Clase_5;
import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args){

        //Ingrese un número aleatorio
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();

        //Número para adivinar
        double aleatorio = Math.random() * 100;
        int number = (int)aleatorio;

        //Código para verificar el número
        if (number == numero){
            System.out.println("¡ACERTASTE! Adivinaste el número, y este era: " + numero);
        }
        else{
            System.out.println("¡ERROR! El número no era: " + numero);
            System.out.println("El numero es: " + number);
        }


    }
}
