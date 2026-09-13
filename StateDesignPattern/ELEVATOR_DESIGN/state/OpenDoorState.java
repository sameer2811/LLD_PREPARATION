package StateDesignPattern.ELEVATOR_DESIGN.state;

import StateDesignPattern.ELEVATOR_DESIGN.enums.ElevatorState;
import StateDesignPattern.ELEVATOR_DESIGN.models.Elevator;

public class OpenDoorState implements State {
    private Elevator elevator;

    public OpenDoorState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void openDoor() {
        System.out.println("Door is already opening");

        System.out.println("Doors are opened");
    }

    @Override
    public void closeDoor() {
        System.out.println("Closing door");
    }

    @Override
    public void moveUp() {
        throw new IllegalStateException("Cannot move up in Open Door State");
    }

    @Override
    public void moveDown() {
        throw new IllegalStateException("Cannot move down in Open Door State");
    }

    @Override
    public void stop() {
        throw new IllegalStateException("Lift is already stopped for the door open state");
    }

    @Override
    public void activate(int floor) {
        System.out.println("Activating floor " + floor);
    }

    @Override
    public ElevatorState getCurrentState() {
        return ElevatorState.DOOR_OPEN;
    }
}
