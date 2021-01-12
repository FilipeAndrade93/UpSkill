package Autonomo1;

public class Pawn extends ChessPiece {

    String color;

    public Pawn(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public int[][] possibleMoves() {
        return new int[0][];
    }
}
