package com.korebit.logic.datastructure;

import javax.swing.*;

/**
 * @author beltr
 */
public class Heap {

    private Node start, end;
    StringBuilder heap = new StringBuilder();

    public Heap() {
        start = null;
        end = null;
    }

    public boolean isEmptyForHeap() {
        return start == null;
    }

    public void insert(int info) {
        Node nuevo = new Node();
        nuevo.info = info;
        nuevo.next = null;
        if (isEmptyForHeap()) {
            start = nuevo;
        } else {
            end.next = nuevo;
        }
        end = nuevo;
    }

    public int extract() {
        if (!isEmptyForHeap()) {
            int info = start.info;
            if (start == end) {
                start = null;
                end = null;
            } else {
                start = start.next;
            }
            return info;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public void show() {
        Node recorrido = start;
        StringBuilder row = new StringBuilder();
        while (recorrido != null) {
            heap.append(recorrido.info).append(" ");
            recorrido = recorrido.next;
        }
        //Método Split permite separar cadenas
        String[] str = heap.toString().split(" ");
        for (int i = str.length - 1; i >= 0; i--) {
            row.append(" ").append(str[i]);
        }
        JOptionPane.showMessageDialog(null, row.toString());
        heap = new StringBuilder();
    }
}
