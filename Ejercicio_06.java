//Ejercicio 4
//Parte 20

import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
 
        Scanner ent = new Scanner (System.in); //Objeto Scanner para leer desde teclado

        System.out.print("Escriba un palabra: "); //Imprime instrucciones

        String palabra = ent.nextLine(); //Variable donde se almacenará el dato ingresado de teclado
        
        char normal [] = palabra.toCharArray(); //Convertir palabra a arreglo
        String invertido="";

        for(int i=normal.length-1;i>=0; i--){
           invertido+=normal[i];
        }
        System.out.println(invertido);
    
    }
    
}
