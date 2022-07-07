package main.java.damianmatysko;

import java.util.ArrayList;

public class Elevator {
    int currentPosition;
    final String floors = "1, 2, 3, 4";
    ArrayList<Passenger> passengersInside;

    public Elevator(int currentPosition) {
        this.currentPosition = currentPosition;
        this.passengersInside = new ArrayList<>();
    }

    public int passengerCount() {
        return passengersInside.size();
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public boolean isEmpty() {
        return passengersInside.isEmpty();
    }

    public void fillIn(Passenger newPassenger) {
        if (passengersInside.size() == 4) {
            System.out.println("The elevator is full!");
        } else {
            passengersInside.add(newPassenger);
        }
    }

    public void fillOut(Passenger oldPassenger) {
        if (isEmpty()) {
            System.out.println("The elevator is already empty!");
        } else {
            passengersInside.remove(oldPassenger);
        }
    }

    public int isMoving(int floor) {
        if (!floors.contains(Integer.toString(floor))) {
            System.out.println("You have inputted the wrong floor! The selected floor is changed to 1!");
            return 1;
        }
        if (floor > currentPosition) {
            while (getCurrentPosition() != floor) {
                currentPosition++;
            }
            return getCurrentPosition();
        } else {
            if (floor < getCurrentPosition()) {
                while (getCurrentPosition() != floor) {
                    currentPosition--;
                }
                return getCurrentPosition();
            }
        }
        return getCurrentPosition();
    }

    public void printList() {
        for (Passenger passenger : passengersInside) {
            System.out.println(passenger.toString());
        }
    }

}
