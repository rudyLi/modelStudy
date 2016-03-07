package com.cn.lifeng.model.StateModel.State;

/**
 * Created by lifeng on 16/3/7.
 */
public class North implements Direction {

    public Direction turnLeft() {
        return new West();
    }

    public Direction turnRight() {
        return new East();
    }
    public String toString(){
        return "N";
    }
}
