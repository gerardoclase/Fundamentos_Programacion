package bloque2.tema6.ejercicios;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu sueldo anual: ");
        double sueldo = sc.nextDouble();

        double retencion = 0;
        if (sueldo <=120000){
            retencion = 0;
        }else if (sueldo<250000) {
            retencion = 10;
        }else if (sueldo <400000){
            retencion = 20;
        }else
            retencion = 30;

        System.out.println("Tu retención es del: " +retencion +"%");
        sc.close();
    }
}
