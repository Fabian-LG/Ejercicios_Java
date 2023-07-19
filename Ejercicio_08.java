import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) throws Exception {
       
        Scanner ent = new Scanner(System.in);
       
        System.out.println("¿Cuál es la temperatura?");

        double centigrados = ent.nextDouble();

        double farenheit = 32 + (1.8 * centigrados);


        System.out.println("La temperatura es: " + farenheit + " °f");

    }
}
