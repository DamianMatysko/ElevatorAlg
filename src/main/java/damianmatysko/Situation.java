package main.java.damianmatysko;

import java.util.ArrayList;
import java.util.Scanner;

public class Situation {
    ArrayList<Passenger> waitingPassengers;

    public Situation() {
        this.waitingPassengers = new ArrayList<>();
    }


    public ArrayList<Passenger> setPassengers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input count of passengers: ");
        int countPassengers = in.nextInt();
        System.out.println("You entered " + countPassengers + " passengers");
        for (int i = 1; i <= countPassengers; i++) {

            System.out.println("Set passenger NO. " + i + " current floor ");
            int currentFloor = in.nextInt();
            System.out.println("You entered integer " + currentFloor);

            System.out.println("Set passenger NO. " + i + " selected floor ");
            int selectedFloor = in.nextInt();
            System.out.println("You entered integer " + selectedFloor);

            Passenger passenger = new Passenger(currentFloor, selectedFloor);
            waitingPassengers.add(passenger);
        }
        return waitingPassengers;
    }

    public ArrayList<Passenger> getWaitingPassengers() {
        return waitingPassengers;
    }

    private void printList(ArrayList<Passenger> passengers) {
        for (Passenger passenger : passengers) {
            System.out.println(passenger.toString());
        }
    }
}

