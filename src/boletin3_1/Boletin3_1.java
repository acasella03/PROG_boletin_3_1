package boletin3_1;

import java.io.InputStream;
import java.util.Scanner;

public class Boletin3_1 {

    public static void main(String[] args) {
        Scanner descuento = new Scanner (System.in);
        System.out.println("Introduzca precio tarifa");
        double preciotarifa = descuento.nextDouble();
        System.out.println("Introduzca precio pagado");
        double preciopagado = descuento.nextDouble();
        double PorcentajeDescuento=100-(preciopagado/preciotarifa*100);
        System.out.println("El descuento aplicado fue el "+PorcentajeDescuento+"%");
    }
    
}
