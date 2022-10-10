import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la cantidad de pesetas: ");
        double n = sc.nextInt();
        double euros = 0.0060;
        
        System.out.print("La cantidad de "+ n + " pesetas en euros, son: " + n*euros);
    }
}
