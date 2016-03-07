package com.cn.lifeng.model.StateModel;

import com.cn.lifeng.model.StateModel.State.Direction;
import com.cn.lifeng.model.StateModel.State.Directions;

/**
 * Created by lifeng on 16/3/7.
 */
public class Location {
    private int x;
    private int y;
    private Direction direction;

    public String toString(){
        return x + " " + y + " " + direction.toString();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    public void setDirection(String direction) {
        this.direction = Directions.getDirection(direction);
    }
}
