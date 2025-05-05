import java.util.Scanner;

public class Esercizio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi un numero");
        double a1 = scanner.nextDouble();
        System.out.println("Dammi un secondo numero");
        double a2 = scanner.nextDouble();
        System.out.println("Dammi un numero intero");
        int a3 = scanner.nextInt();


        perimetroRettangolo(a1, a2);
    }

    public static void perimetroRettangolo(double a, double b){
        System.out.println((a*2)+(b*2));
    }



}
