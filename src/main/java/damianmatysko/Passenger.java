package main.java.damianmatysko;

public class Passenger {
    int currentFloor;
    int selectedFloor;

    public Passenger(int currentFloor, int selectedFloor) {
        this.currentFloor = currentFloor;
        this.selectedFloor = selectedFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getSelectedFloor() {
        return selectedFloor;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "currentFloor=" + currentFloor +
                ", selectedFloor=" + selectedFloor +
                '}';
    }
}