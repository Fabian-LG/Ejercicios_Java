//Ejercicio 4
//Parte 4

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);

     int n = 0; //Declaración de variables
     int suma = 0; //Declaración de variables
     double prom = 0; //Declaración de variables

     while (n <10){
         System.out.println("Ingrese un número entero: ");
         int nums = ent.nextInt();

         suma = suma + nums;    
         n+=1;

        prom = suma / 10.0;
     }

     System.out.println("La suma es: " + suma);
     System.out.println("El promedio es: " + prom);
   
    }
}
