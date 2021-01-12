package Autonomo9;

import java.util.Scanner;

public class Autonomo9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduza o dia do seu aniversário utilizando algarismos (1 - 31):");

        int dia = in.nextInt();

        System.out.println("Introduza o mês do seu aniversário utilizando algarismos (1 - 12):");

        int mes = in.nextInt();

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || (dia > 29 && mes == 2) || (dia > 30 && mes == 4) || (dia > 30 && mes == 6) || (dia > 30 && mes == 9)){
            System.out.println("Não foi possível reconhecer o teu signo. Tenta de novo.");
        } else if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)){
            System.out.println("O teu signo é Carneiro");
        } else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)){
            System.out.println("O teu signo é Touro");
        } else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)){
            System.out.println("O teu signo é Gémeos");
        } else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)){
            System.out.println("O teu signo é Caranguejo");
        } else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)){
            System.out.println("O teu signo é Leão");
        } else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)){
            System.out.println("O teu signo é Virgem");
        } else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)){
            System.out.println("O teu signo é Balança");
        } else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)){
            System.out.println("O teu signo é Escorpião");
        } else if ((dia >= 22 && mes == 11) || (dia <= 21 &&  mes == 12)){
            System.out.println("O teu signo é  Sagitário");
        } else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)){
            System.out.println("O teu signo é Capricórnio");
        } else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)){
            System.out.println("O teu signo é Aquário");
        } else {
            System.out.println("O teu signo é Peixes");
        }
    }
}
