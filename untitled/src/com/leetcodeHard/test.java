package com.leetcodeHard;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<List<String>> result = new ArrayList<>();
int n =5  ;
        // Initialize board
        List<String> board = new ArrayList<>();
        String rowStr = ".".repeat(n);
        for (int i = 0; i < n; i++) {
            board.add(rowStr);
        }
        System.out.println(board);
    }
}
