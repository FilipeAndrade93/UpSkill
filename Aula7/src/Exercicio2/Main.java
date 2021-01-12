package Exercicio2;

public class Main {

    public static void main(String[] args) {
        FieldPlayer cr7 = new FieldPlayer("Cristiano Ronaldo", 7);
        Goalkeeper rp1 = new Goalkeeper("Rui Patrício", 1);

        System.out.println(cr7);
        System.out.println(rp1);

        rp1.addGoalConceded();
        cr7.addGoal();

        System.out.println(cr7);
        System.out.println(rp1);

        cr7.addPassReceived();

        System.out.println(cr7);
    }
}
