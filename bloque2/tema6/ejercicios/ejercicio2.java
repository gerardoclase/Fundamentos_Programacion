package bloque2.tema6.ejercicios;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();

        if (edad >=0 && edad <12) {
            System.out.println("Niño");

        }else if (edad >11 && edad <18) {
            System.out.println("Adolescente");

        }else if (edad >17 && edad <65) {
            System.out.println("Adulto");
            
        }else { 
            System.out.println("Mayor");
        }
        
    }
}
