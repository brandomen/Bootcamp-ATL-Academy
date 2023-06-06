package Clase_5;
import java.util.Scanner;
public class Ejercicio_3 {
    //CALCULADORA DE DESCUENTO
    public static void main(String[] args) {

        //Ingresar el precio original
        Scanner precioInicial = new Scanner(System.in);
        System.out.println("Ingrese el precio original del producto: ");
        double Inicial = precioInicial.nextDouble();

        //Ingresar el porcentaje de descuento
        Scanner porcentajeDescuento = new Scanner(System.in);
        System.out.println("Ingrese el porcentaje de descuento: ");
        double porcentaje = porcentajeDescuento.nextDouble();

        //Cálculo del precio final aplicado el descuento
        double precioFinal;
        precioFinal = Inicial - (porcentaje*Inicial/100);

        System.out.println("El precio final es: " + precioFinal);
    }
}
