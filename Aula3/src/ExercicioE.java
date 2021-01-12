import java.util.Scanner;

public class ExercicioE {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");

        int n1 = in.nextInt();

        System.out.println("Insira  o segundo número:");

        int n2 = in.nextInt();

        System.out.println("Insira o terceiro número:");

        int n3 = in.nextInt();

        System.out.println("O maior número é: " + Math.max(n1, Math.max(n2, n3)));
    }
}
