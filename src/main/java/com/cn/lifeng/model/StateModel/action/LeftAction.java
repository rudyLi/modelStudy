package com.cn.lifeng.model.StateModel.action;

import com.cn.lifeng.model.StateModel.Location;
import com.cn.lifeng.model.StateModel.RoverManager;

/**
 * Created by lifeng on 16/3/7.
 */
public class LeftAction implements Action {
    RoverManager roverMangerContext;
    public LeftAction(RoverManager roverManager){
        roverMangerContext = roverManager;
    }
    public void takeAction() {
        Location location = roverMangerContext.getLocation();
        location.setDirection(location.getDirection().turnLeft());
    }
}
