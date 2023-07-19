//Ejercicio 4
//Parte 13

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        
        
        int valor = 0;

        Scanner ent = new Scanner (System.in); //Objeto Scanner para leer desde teclado

        System.out.print("Ingrese un número entero: "); //Imprime instrucciones

        valor = ent.nextInt(); //Variable donde se almacenará el dato ingresado de teclado
        
        int factorial=1;
        int fact = valor;

        while(valor!=0){
            factorial = factorial * valor; //Cálculo del factorial
            valor--;
        }
        System.out.println("El factorial de " + fact + " es: " + factorial);
    }
    
}
