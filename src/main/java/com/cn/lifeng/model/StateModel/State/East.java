package com.cn.lifeng.model.StateModel.State;

/**
 * Created by lifeng on 16/3/7.
 */
public class East implements Direction {
    public Direction turnLeft() {
        return new North();
    }

    public Direction turnRight() {
        return new South();
    }
    public String toString(){
        return "E";
    }
}
