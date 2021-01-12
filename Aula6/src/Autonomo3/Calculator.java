package Autonomo3;

public class Calculator {

    private int operation;

    private String[] historic;

    public Calculator(){
        this.operation = 0;
        this.historic = new String[10];
    }

    public double getOperation() {
        return operation;
    }

    public void printHistoric() {
        for (int i = 0; i < operation; i++){
            System.out.println(historic[i]);
        }
    }

    public void addToHistoric(String op){
        historic[operation] = op;
        operation++;
    }

    public double sum(int a, int b){
        int result = a + b;
        String currentop = a + " + " + b + " = " + result;
        addToHistoric(currentop);
        return result;
    }

}
