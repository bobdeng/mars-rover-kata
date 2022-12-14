package com.uperform.tdd;

import lombok.Getter;

@Getter
public enum Direction {
    North(0, 1), West(-1, 0), East(1, 0), South(0, -1);

    private int x;
    private int y;

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position forward(Position position) {
        return position.forward(x, y);
    }
}
