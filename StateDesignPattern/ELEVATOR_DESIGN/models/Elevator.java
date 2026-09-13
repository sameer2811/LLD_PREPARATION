package StateDesignPattern.ELEVATOR_DESIGN.models;

import java.util.Map;

import StateDesignPattern.ELEVATOR_DESIGN.enums.Direction;
import StateDesignPattern.ELEVATOR_DESIGN.state.State;

public class Elevator {

    private State state;

    private int currentFloor;

    private Direction direction;

    private Map<Integer, Boolean> pressedFloorButtons;

    public Elevator(Builder builder) {
        this.state = builder.state;
        this.currentFloor = builder.currentFloor;
    }

    public void updateElevatorState(State state) {
        this.state = state;
    }

    public void add(int floor) {
        this.state.activate(floor);
    }

    public void pressFloorButton(int floor) {
        this.state.activate(floor);
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }

    public Map<Integer, Boolean> getPressedFloorButtons() {
        return this.pressedFloorButtons;
    }

    public static class Builder {
        private State state;
        private int currentFloor;

        public Builder setState(State state) {
            this.state = state;
            return this;
        }

        public Builder setCurrentFloor(int currentFloor) {
            this.currentFloor = currentFloor;
            return this;
        }

        public Elevator build() {
            return new Elevator(this);
        }
    }
}
