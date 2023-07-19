//Ejercicio 4
//Parte 3

import java.util.Scanner;

public class Ej3{

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in); //Objeto Scanner para leer desde teclado

        System.out.print("Ingrese un dato de prueba: "); //Imprimir instrucciones
        
        int num = ent.nextInt(); //Variable donde se almacenará el dato ingresado de teclado

        int sum = 0; //Variable para almacenar la suma

        System.out.println("Los primeros " + num + " números natuales son:"); //Imprimir instrucciones

        for (int n = 1; n <=num; n+=1){ 
                sum = sum + n;
                System.out.println(n);
        }

System.out.println("La suma del número natural hasta " + num + " términos es: " + sum);

    }
}