package main.java.damianmatysko;

public class Main {
    public static void main(String[] args) {

        System.out.println("System start");
        Situation situation_1 = new Situation();

        System.out.println("Simulate the passengers");
        situation_1.setPassengers();

        Elevator elevator = new Elevator(1);

        System.out.println("Elevator initial floor: " + elevator.getCurrentPosition());
        System.out.println("Elevator is moving...");

        for (int i = 0; i < situation_1.getWaitingPassengers().size(); i++) {

            if (elevator.getCurrentPosition() != situation_1.getWaitingPassengers().get(i).getCurrentFloor()) {
                System.out.println("Elevator is on floor:" + elevator.getCurrentPosition());
                System.out.println("The elevator is moving to the current passenger's floor");

                elevator.isMoving(situation_1.getWaitingPassengers().get(i).getCurrentFloor());

                System.out.println("Elevator is on floor:" + elevator.getCurrentPosition());
                System.out.println("Elevator is on current passenger's floor - the passenger is entering...");
                elevator.fillIn(situation_1.getWaitingPassengers().get(i));
                elevator.printList();
            } else {
                System.out.println("Elevator is already on floor:" + elevator.getCurrentPosition());
                System.out.println("Elevator is on current passenger's floor - the passenger is entering...");
                elevator.fillIn(situation_1.getWaitingPassengers().get(i));
                elevator.printList();
            }

            if (elevator.getCurrentPosition() != situation_1.getWaitingPassengers().get(i).getSelectedFloor()) {
                System.out.println("Elevator is on floor:" + elevator.getCurrentPosition());
                System.out.println("The elevator is moving to the selected passenger's floor");

                elevator.isMoving(situation_1.getWaitingPassengers().get(i).getSelectedFloor());

                System.out.println("Elevator is on floor:" + elevator.getCurrentPosition());
                System.out.println("Elevator is on current passenger's floor - the passenger is leaving...");
                elevator.fillOut(situation_1.getWaitingPassengers().get(i));

                elevator.printList();
            } else {
                System.out.println("Elevator is already on floor:" + elevator.getCurrentPosition());
                System.out.println("Elevator is on current passenger's floor - the passenger is leaving...");
                elevator.fillOut(situation_1.getWaitingPassengers().get(i));
            }

        }
        System.out.println();
        System.out.println("The amount of passengers inside the elevator is empty." + elevator.passengerCount());
        System.out.println("Elevator stops.");
    }
}

