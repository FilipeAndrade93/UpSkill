package Autonomo4;

public class Car {

    private String brand;
    private String model;
    private int seats;
    private String licensePlate;
    private String datePurchase;
    private int consumption;
    private int maxFuel;
    private int currentFuel;
    private boolean on;

    public Car(String brand, int maxFuel){
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.seats  = seats;
        this.maxFuel = maxFuel;
        this.currentFuel = 0;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public void setCurrentFuel(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    public int fillDeposit(){
        int remain = getMaxFuel() - getCurrentFuel();
        setCurrentFuel(getCurrentFuel() + remain);
        return getCurrentFuel();
    }

    public boolean isOn(){
        return on;
    }

    public boolean turnOn(){
        return on = true;
    }

    public boolean turnOff(){
        return on = false;
    }
}
