package com.cn.lifeng.dataStructure.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lifeng on 16/3/15.
 */
public class Vertex {
    private String id;
    private boolean isVisited = false;
    private List<Vertex> attention =  new ArrayList<Vertex>();

    public Vertex(String id){
        this.id = id;
    }
    public void addNewAttention(Vertex ele){
        attention.add(ele);
    }
    public void setVisited(){
        isVisited = true;
    }
    public boolean isVisited(){
        return isVisited;
    }
    public List<Vertex> getAttention(){
        return attention;
    }
    public String getId(){
        return id;
    }

}
