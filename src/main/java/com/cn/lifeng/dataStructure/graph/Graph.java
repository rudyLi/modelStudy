package com.cn.lifeng.dataStructure.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lifeng on 16/3/15.
 */
public class Graph {
    private Vertex root;
    public Graph(Vertex vertex){
       root = vertex;
    }
    public List<Vertex> getAllVertex(){
        List<Vertex> all = new ArrayList<Vertex>();
        iterate(root,all);
        return all;
    }

    private void iterate(Vertex vertex,List<Vertex> elements) {
        vertex.setVisited();
        elements.add(vertex);
        for (Vertex child : vertex.getAttention()) {
            if (!child.isVisited()) {
                iterate(child, elements);
            }
        }
    }

    public static void main(String[] args) {
        Vertex root = new Vertex("root");
        Vertex player1 = new Vertex("player1");
        Vertex player2 = new Vertex("player2");
        Vertex player3 = new Vertex("player3");
        root.addNewAttention(player1);
        root.addNewAttention(player3);
        player1.addNewAttention(player2);
        player1.addNewAttention(root);
        player2.addNewAttention(player3);
        Graph graph = new Graph(root);
        for(Vertex vertex :graph.getAllVertex()){
            System.out.println(vertex.getId());
        }
    }
}
