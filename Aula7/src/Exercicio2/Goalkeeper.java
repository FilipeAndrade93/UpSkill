package Exercicio2;

public class Goalkeeper extends Player {

    private int goalsConceded = 0;

    public Goalkeeper(String name, int playerNumber) {
        super(name, playerNumber);
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public int addGoalConceded(){
        goalsConceded++;
        return getGoalsConceded();
    }

    @Override
    public String toString() {
        return "Player--> " + playerNumber + " - " + name + " // " + "Goals Scored: " + goal + " // " + "Goals Conceded: " + goalsConceded;
    }
}
