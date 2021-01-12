import java.util.Scanner;

public class ExercicioD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira um número:");

        int input = in.nextInt();

        if (input > 0){
            System.out.println("O número é positivo");
        } else if (input < 0){
            System.out.println("O número é negativo");
        } else{
            System.out.println("É 0");
        }
    }

}
