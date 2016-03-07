package com.cn.lifeng.model.StateModel.action;

import com.cn.lifeng.model.StateModel.Location;
import com.cn.lifeng.model.StateModel.RoverManager;
import com.cn.lifeng.model.StateModel.action.Action;

/**
 * Created by lifeng on 16/3/7.
 */
public class MoveAction implements Action {
    RoverManager roverManagerContext;
    public MoveAction(RoverManager roverManager){
       this.roverManagerContext = roverManager;
    }
    public void takeAction() {
        Location location = roverManagerContext.getLocation();
        String direction = location.getDirection().toString();

        if(direction.equals("E")){
            location.setX(location.getX()+1);
        }else if(direction.equals("W")){
            location.setX(location.getX()-1);
        }else if(direction.equals("N")){
            location.setY(location.getY()+1);
        }else if(direction.equals("S")){
            location.setY(location.getY()-1);
        }
    }
}