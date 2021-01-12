package Autonomo6;

import java.util.Scanner;

public class Autonomo6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Escolhe um dos veículos:");

        System.out.println("- Monociclo");

        System.out.println("- Bicicleta");

        System.out.println("- Mota");

        System.out.println("- Triciclo");

        System.out.println("- Carro");

        System.out.println("- Camião");

        System.out.println("Selecção:");

        String input = in.nextLine();

        switch (input) {
            case "Monociclo" -> System.out.println("Tem 1 roda");
            case "Bicicleta", "Mota" -> System.out.println("Tem 2 rodas");
            case "Carro", "Camião" -> System.out.println("Tem 4 rodas");
            default -> System.out.println("Essa opção não existe.");
        }
    }
}
