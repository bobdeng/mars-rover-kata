package com.uperform.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MarsRoverTest {
    //向前移动
    //todo 向东移动
    @Test
    public void should_move_to_east() {
        Position position = new Position(0, 0);
        Area area = new Area(10, 10);
        MarsRover marsRover = new MarsRover(position, Direction.East, area);

        marsRover.forward();

        assertEquals(marsRover.position(), new Position(1, 0));
    }

    //todo 向北移动
    @Test
    public void should_move_to_north() {
        Position position = new Position(0, 0);
        MarsRover marsRover = new MarsRover(position, Direction.North, new Area(10, 10));

        marsRover.forward();

        assertEquals(marsRover.position(), new Position(0, 1));
    }

    //todo 向西移动
    @Test
    public void should_move_to_west() {
        Position position = new Position(1, 1);
        MarsRover marsRover = new MarsRover(position, Direction.West, new Area(10, 10));

        marsRover.forward();

        assertEquals(marsRover.position(), new Position(0, 1));
    }

    //todo 向南移动
    @Test
    public void should_move_to_south() {
        Position position = new Position(1, 1);
        MarsRover marsRover = new MarsRover(position, Direction.South, new Area(10, 10));

        marsRover.forward();

        assertEquals(marsRover.position(), new Position(1, 0));
    }

    //todo 大于最大xy
    @Test
    public void should_throw_when_x_exceed_max_width() {
        Position position = new Position(10, 10);
        MarsRover marsRover = new MarsRover(position, Direction.East, new Area(10, 10));
        assertThrows(ExceedBorderException.class, marsRover::forward);

    }
    @Test
    public void should_throw_when_y_exceed_max_width() {
        Position position = new Position(10, 10);
        MarsRover marsRover = new MarsRover(position, Direction.North, new Area(10, 10));
        assertThrows(ExceedBorderException.class, marsRover::forward);

    }
    //todo 小于0
    @Test
    public void should_throw_when_x_lesser_than_0() {
        Position position = new Position(0, 0);
        MarsRover marsRover = new MarsRover(position, Direction.West, new Area(10, 10));
        assertThrows(ExceedBorderException.class, marsRover::forward);

    }
    @Test
    public void should_throw_when_y_lesser_than_0() {
        Position position = new Position(0, 0);
        MarsRover marsRover = new MarsRover(position, Direction.South, new Area(10, 10));
        assertThrows(ExceedBorderException.class, marsRover::forward);

    }
    //左转向
    //todo 东
    //todo 北
    //todo 西
    //todo 南
    //右转向
    //todo 东
    //todo 北
    //todo 西
    //todo 南
    //后退
    //todo 向东移动
    //todo 向北移动
    //todo 向西移动
    //todo 向南移动
    //todo 大于最大xy
    //todo 小于0

}
