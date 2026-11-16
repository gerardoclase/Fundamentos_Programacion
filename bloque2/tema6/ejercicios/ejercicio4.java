package bloque2.tema6.ejercicios;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Eres socio? s/n");
       char socio = sc.next().charAt(0);

        System.out.println("Tienes efectivo? s/n");
       char efectivo = sc.next().charAt(0);

       int descuento = 0;

       if (socio == 's') {
            descuento = descuento + 5;
       }

       if (efectivo == 's') {
            descuento = descuento +2;
       }

       System.out.println("El descuento es " + descuento);
       sc.close();
    }
}
