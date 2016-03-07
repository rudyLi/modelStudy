package com.cn.lifeng.model.StateModel.State;

/**
 * Created by lifeng on 16/3/7.
 */
public class Directions {
    public static Direction getDirection(String direc){
        Direction direction;
        if(direc.equals("N")){
            direction = new North();
        } else if(direc.equals("S")){
            direction = new South();
        }else if(direc.equals("W")){
            direction = new West();
        }else{
            direction = new East();
        }
        return direction;
    }
}
