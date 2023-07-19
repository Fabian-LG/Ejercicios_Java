import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) throws Exception {
        /*
        System.out.println("TABLA DE MULTIPLICAR");

        System.out.println("Escriba un número: ");

        Scanner ent = new Scanner (System.in);

        int num = ent.nextInt();

        for(int n = 1 ; n < 11 ; n+=1){


            System.out.println(num + "x" + n + "=" + num*n);
     
        }

       */
      System.out.println("TABLA DE MULTIPLICAR");

      System.out.println("Escriba un número: ");

      Scanner ent = new Scanner (System.in);

      int num = ent.nextInt();

      int j = 1;

      do{
          

        for(int n = 1 ; n < 11 ; n+=1){


            System.out.println(j + "x" + n + "=" + j*n);
     
        } 
        System.out.println("");

        j++;
      }while(j<= num);

      
    }
}
