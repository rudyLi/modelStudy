package com.cn.lifeng.dataStructure.tree;

import java.util.Comparator;
import java.util.Stack;

/**
 * Created by lifeng on 16/3/15.
 */
public class BinaryTree<T extends Comparator<? super T>>{
    private Node<T> root;
    public BinaryTree(){
        root = null;
    }
    public BinaryTree(Node root){
        this.root = root;
    }
    public void iterate(Node node){
        System.out.println(node.toString());
        if(node.leftNode!=null) {
            iterate(node.leftNode);
        }
        if(node.rightNode!=null){
            iterate(node.rightNode);
        }
    }
    //stack method
    private Stack<Node> tmp = new Stack<Node>();
    public void iterateWithStack(Node node){
        tmp.push(node);
        while(!tmp.isEmpty()){
            Node tmpNode = tmp.pop();
            System.out.println(tmpNode.element);
            tmp.push(tmpNode.rightNode);
            tmp.push(tmpNode.leftNode);
        }
    }

}