package com.cn.lifeng.model.DecoratorModel;

/**
 * Created by lifeng on 16/3/15.
 */
public class DecoratorModelExample {
    public static void main(String[] args) {
        IOutputCollector countCollector = new StaticsOutputCollector(new MyOutputCollector());
        countCollector.emit("hello");
        countCollector.emit("world");
    }
}
