package bloque2.tema5.Ejercicios;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero entero:");
        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println(numero + " Es positivo");
        } else {
            System.out.println(numero + "Es negativo");
        }
        sc.close();
    }
}
