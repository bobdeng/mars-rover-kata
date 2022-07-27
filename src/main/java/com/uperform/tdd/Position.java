package com.uperform.tdd;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public Position forward(int x, int y) {

        return new Position(this.x + x, this.y + y);
    }
}
