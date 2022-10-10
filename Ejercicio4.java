import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la cantidad de euros: ");
        double n = sc.nextInt();
        double pesetas = 166.38;
        
        System.out.print("La cantidad de "+ n + " euros en pesetas, son: " + n*pesetas);
    }
}
