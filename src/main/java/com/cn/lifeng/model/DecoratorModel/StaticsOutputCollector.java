package com.cn.lifeng.model.DecoratorModel;

/**
 * Created by lifeng on 16/3/15.
 */
public class StaticsOutputCollector implements IOutputCollector {
    private IOutputCollector delegate;
    private int count=0;
    public StaticsOutputCollector(IOutputCollector outputCollector){
        delegate = outputCollector;
    }
    public void emit(String message) {
        delegate.emit(message);
        count++;
        System.out.println("emit message count:" + count);
    }
}
