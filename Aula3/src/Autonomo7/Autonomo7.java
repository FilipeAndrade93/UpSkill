package Autonomo7;

public class Autonomo7 {

    public static void main(String[] args) {
        int grade = 0;

        if (grade >= 0  && grade <30){
            System.out.println("Muito  Insuficiente");
        }else if (grade >= 30 && grade < 50){
            System.out.println("Insuficiente");
        }else if (grade >= 50 && grade < 70){
            System.out.println("Suficiente");
        }else if (grade >= 70 && grade < 80){
            System.out.println("Bom");
        }else if (grade >= 80 && grade < 90){
            System.out.println("Muito Bom");
        } else if (grade >= 90 && grade <= 100){
            System.out.println("Excelente");
        } else {
            System.out.println("Nota inválida");
        }
    }
}
