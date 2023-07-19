import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        double nRand = Math.random();

        int numA = (int) (nRand * 1000) + 1;
        //System.out.println(numA);

        Scanner ent = new Scanner (System.in);

        System.out.println("ADIVINA EL NÚMERO");

        System.out.println("Escriba un número entre 1 y 1000");
        
        for(int n = 0; n <10; n++){
            
            int num = ent.nextInt();

            if (num < numA){
                System.out.println("El número es mayor");

                continue;
                
            } else if (num > numA){
                System.out.println("El número es menor");
                continue;

            } else{
                System.out.println("Adivinaste el número");
                break;

            }


        }

    }
}
