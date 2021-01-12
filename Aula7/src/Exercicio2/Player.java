package Exercicio2;

public class Player {

    String name;
    int playerNumber;
    int goal;

    public Player(String name, int playerNumber){
        this.name = name;
        this.playerNumber = playerNumber;
        this.goal = 0;
    }

    public String getName() {
        return name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getGoal() {
        return goal;
    }

    public int addGoal(){
        goal++;
        return getGoal();
    }

    @Override
    public String toString() {
        return "Player--> " + playerNumber + " - " + name + " // " + "Goals Scored: " + goal;
    }
}
