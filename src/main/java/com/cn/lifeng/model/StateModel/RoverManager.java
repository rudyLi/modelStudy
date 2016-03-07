package com.cn.lifeng.model.StateModel;

import com.cn.lifeng.model.StateModel.action.Action;
import com.cn.lifeng.model.StateModel.action.LeftAction;
import com.cn.lifeng.model.StateModel.action.MoveAction;
import com.cn.lifeng.model.StateModel.action.RightAction;

/**
 * Created by lifeng on 16/3/7.
 */
public class RoverManager {
    Action moveAction;
    Action rightAction;
    Action leftAction;
    Location location;

    public RoverManager(int originX, int originY) {
        leftAction = new LeftAction(this);
        rightAction = new RightAction(this);
        moveAction = new MoveAction(this);
        location = new Location();
    }

    public void takeCommand(char command) {
        switch (command) {
            case 'L':
                leftAction.takeAction();
                break;
            case 'R':
                rightAction.takeAction();
                break;
            case 'M':
                moveAction.takeAction();
                break;
            default:
                System.out.println("command is illegal");
        }

    }

    public void setOriginLocation(int x, int y, String direction) {
        location.setX(x);
        location.setY(y);
        location.setDirection(direction);
    }

    public Location getLocation() {
        return location;
    }

    public void printLocation() {
        System.out.println(location.toString());
    }
}

