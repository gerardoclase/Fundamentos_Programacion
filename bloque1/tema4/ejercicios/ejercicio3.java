package bloque1.tema4.ejercicios;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println(" Primer numero entero ");
      int numero1 = sc.nextInt();

      System.out.println(" Dime otro numero entero ");
      int numero2 = sc.nextInt();

      int media = (numero1+numero2)/2;
      System.out.println("La media es : " + (double) media);

    }
}
