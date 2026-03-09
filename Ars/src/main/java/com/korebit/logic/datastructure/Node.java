package com.korebit.logic.datastructure;

/**
 * @author beltr
 */
public class Node {

    protected Node next;
    protected int info;

    public Node() {
    }

    public Node(int n) {
        info = n;
        next = null;
    }
}
