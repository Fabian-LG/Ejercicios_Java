import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        double nRand = Math.random();

        int numA = (int) (nRand * 1000) + 1;
    
        Scanner ent = new Scanner (System.in);

        System.out.println("ADIVINA EL NÚMERO");

        System.out.println("Escriba un número entre 1 y 1000");

        int n = 0;

        while(n<10){

            int num = ent.nextInt();

            if (num < numA){
                System.out.println("El número es mayor");

                n+=1;
                continue;
                
            } else if (num > numA){
                System.out.println("El número es menor");
                n+=1;
                continue;

            } else{
                System.out.println("Adivinaste el número");
                break;

            }

        }
        
    }
}
