package com.cn.lifeng.model.StateModel.State;

/**
 * Created by lifeng on 16/3/7.
 */
public class South implements Direction {
    public Direction turnLeft() {
        return new East();
    }

    public Direction turnRight() {
        return new West();
    }
    public String toString(){
        return "S";
    }
}
