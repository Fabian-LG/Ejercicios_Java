//Ejercicio 4
//Parte 19

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        
        int invertido=0;
        int resto=0;

        Scanner ent = new Scanner(System.in); //Objeto Scanner para leer desde teclado

        System.out.print("Ingrese un número: "); //Imprime instrucciones

        int num = ent.nextInt(); //Variable donde se almacenará el dato ingresado de teclado
        int numero2 = num;

        while(num > 0){
            resto = num%10;
            invertido = invertido * 10 + resto;
            num/=10;
        }

        if(numero2==invertido){ //Validación
            System.out.println(invertido + " es un número palíndromo");
        }else{
            System.out.println(invertido + " no es un número palíndromo");
        }

    }
    
}
