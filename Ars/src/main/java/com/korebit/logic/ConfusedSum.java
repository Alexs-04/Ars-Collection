package com.korebit.logic;

import java.util.ArrayList;

import com.korebit.entity.Animal;

public class ConfusedSum {
    public static void main(String[] args) {
        System.out.println(1 + 2 + "3" + 4 + 5);

        var arr = new int[5];
        ArrayList<? extends Animal> a = new ArrayList<>();
        System.out.println(sum(arr));
    }

    static int sum(int... a) {
        int total = 0;
        for (int j : a) {
            total += j;
        }

        return total;
    }

}
