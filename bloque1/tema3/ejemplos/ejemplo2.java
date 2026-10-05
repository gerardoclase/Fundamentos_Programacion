package bloque1.tema3.ejemplos;

import java.util.Scanner;

public class ejemplo2 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Nombre: "); 
  String nombre = sc.nextLine();

  System.out.print("Edad: ");
  int Edad = sc.nextInt();
    sc.nextLine();

  System.out.print("Dime tu incial");
  char inicial = sc.nextLine().charAt(0);

  System.out.println("Hola " + nombre + " tiene " + Edad + " años");
    System.out.println("Tu inicial es: " + inicial);
 }   
}
