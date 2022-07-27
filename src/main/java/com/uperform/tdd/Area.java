package com.uperform.tdd;

import lombok.Data;

@Data
public class Area {
    private int width;
    private int height;

    public Area(int width, int height) {

        this.width = width;
        this.height = height;
    }

    void checkPosition(Position position) {
        if (position.getX() > getWidth()) {
            throw new ExceedBorderException();
        }
        if (position.getX() < 0) {
            throw new ExceedBorderException();
        }
        if (position.getY() > getHeight()) {
            throw new ExceedBorderException();
        }
        if (position.getY() < 0) {
            throw new ExceedBorderException();
        }
    }
}
