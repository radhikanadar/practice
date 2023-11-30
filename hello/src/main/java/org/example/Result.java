package org.example;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Result {
    public static void main(String[] args) {
        int n = 3;
        List<Integer> sortedLst = new ArrayList<>();
        sortedLst.add(1);
        sortedLst.add(2);
        sortedLst.add(3);
        sortedLst.add(4);
        sortedLst.add(5);
        sortedLst.remove(n - 1);
//        HashSet<Integer> result = new HashSet<>(sortedLst);
        for (Integer integer : sortedLst) {
            out.println(integer);
        }
        int i = 0;
        int j = 1;
        out.println(i+++j);
    }
}