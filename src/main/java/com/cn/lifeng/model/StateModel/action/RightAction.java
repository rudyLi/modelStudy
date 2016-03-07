package com.cn.lifeng.model.StateModel.action;

import com.cn.lifeng.model.StateModel.Location;
import com.cn.lifeng.model.StateModel.RoverManager;
import com.cn.lifeng.model.StateModel.action.Action;

/**
 * Created by lifeng on 16/3/7.
 */
public class RightAction implements Action {
    RoverManager roverMangerContext;
    public RightAction(RoverManager roverManager){
        roverMangerContext = roverManager;
    }
    public void takeAction() {
        Location location = roverMangerContext.getLocation();
        location.setDirection(location.getDirection().turnRight());
    }
}
