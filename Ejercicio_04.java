//Ejercicio 4
//Parte 16

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {

    Scanner ent = new Scanner(System.in); //Objeto Scanner para leer desde teclado

        int num = 0;
        System.out.print("Ingrese un número entero: "); //Imprime instrucciones
        num = ent.nextInt();  //Variable donde se almacenará el dato ingresado de teclado

        int cuadrado = 0;

        int suma = 0;

        for(int i=1; i<=num; i++){
            cuadrado = i*i;
                System.out.println(cuadrado);
                suma = suma + cuadrado;
        }
        System.out.println("La suma del número natural cuadrado hasta " + num + " términos es: " + suma);

    }
    
}
