package StateDesignPattern.ELEVATOR_DESIGN.state;

import StateDesignPattern.ELEVATOR_DESIGN.enums.ElevatorState;

public interface State {

    public void openDoor();

    public void closeDoor();

    public void moveUp();

    public void moveDown();

    public void stop();

    public void activate(int floor);

    public ElevatorState getCurrentState();
}
