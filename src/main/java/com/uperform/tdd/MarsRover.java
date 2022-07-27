package com.uperform.tdd;

public class MarsRover {
    private Position position;
    private Direction direction;
    private Area area;

    public MarsRover(Position position, Direction direction, Area area) {

        this.position = position;
        this.direction = direction;
        this.area = area;
    }

    public void forward() {
        Position newPosition = direction.forward(position);
        area.checkPosition(newPosition);
        position = newPosition;
    }

    public Position position() {
        return position;
    }
}
