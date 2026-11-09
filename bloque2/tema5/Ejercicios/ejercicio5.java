package bloque2.tema5.Ejercicios;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu contraseña ");
        String contraseña = sc.nextLine();

        if (contraseña.equals("1234")) {
            System.out.println("Acceso concedido");
            
        }
        else{
            System.out.println("Acceso denegado");
        }
        sc.close();
    }
}
