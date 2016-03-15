package com.cn.lifeng.dataStructure.tree;

/**
 * Created by lifeng on 16/3/15.
 */
public class Node<T> {
    T element;
    Node<T> leftNode;
    Node<T> rightNode;
    public Node(T element){
        this(element,null,null);
    }
    public Node(T element,Node left,Node right){
        this.element = element;
        this.leftNode = left;
        this.rightNode = right;
    }
}
