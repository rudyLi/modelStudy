package com.cn.lifeng.model.StateModel.State;

/**
 * Created by lifeng on 16/3/7.
 */
public class West implements Direction{
    public Direction turnLeft() {
        return new South();
    }

    public Direction turnRight() {
        return new North();
    }
    public String toString(){
        return "W";
    }
}
