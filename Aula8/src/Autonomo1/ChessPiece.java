package Autonomo1;

public abstract class ChessPiece {

    private int[] position;

    public ChessPiece(int x, int y){
       position = new  int[2];
       position[0] = x;
       position[1] = y;
    }

    public abstract int[][] possibleMoves();

    public int[] getPosition() {
        return position;
    }
}
