package com.cn.lifeng.model.DecoratorModel;

/**
 * Created by lifeng on 16/3/15.
 */
public class MyOutputCollector implements IOutputCollector {
    public void emit(String message) {
        System.out.println(message);
    }
}
