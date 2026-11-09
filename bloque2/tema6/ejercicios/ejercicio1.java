package bloque2.tema6.ejercicios;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int numero = sc.nextInt();

        if (numero >0) {
            System.out.println("Es positivo");
        }else if (numero <0) {
            System.out.println("Es negativo");
        }else {
            System.out.println("Es cero");
        }
        sc.close();
    }
}
