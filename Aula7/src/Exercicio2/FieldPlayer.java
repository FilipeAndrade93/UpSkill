package Exercicio2;

public class FieldPlayer extends Player {

    private int passReceived = 0;
    private int passMade = 0;

    public FieldPlayer(String name, int playerNumber) {
        super(name, playerNumber);
    }

    public int getPassMade() {
        return passMade;
    }

    public int getPassReceived() {
        return passReceived;
    }

    public int addPassMade(){
        passMade++;
        return getPassMade();
    }

    public int addPassReceived(){
        passReceived++;
        return getPassReceived();
    }

    @Override
    public String toString() {
        return "Player--> " + playerNumber + " - " + name + " // " + "Goals Scored: " + goal + " // " + "Pass Made: " + passMade + " // " + "Pass Received: " + passReceived;
    }
}
