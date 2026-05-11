package com.leetcodeHard;

import java.util.ArrayList;
import java.util.List;

public class NQueen51 {
public static boolean isSafePostion ( List<String> board , int row , int col ,  int n ) {
    // horizontal cheak
    for( int i =0 ; i< row ; i++ ) {
       if( board.get(i).charAt(col) == 'Q' ) {
           return false ;
       }
    }
    // upwer left cheak
    for( int i = row -1 , j = col -1  ; i>=0 && j>=0 ; i-- , j-- ) {
        if(board.get(i).charAt(j) == 'Q') return  false  ;
    }

    for( int i = row-1 , j = col+1  ; i>= 0  && j < n ; i-- ,j++  ){
        if(board.get(i).charAt(j) == 'Q') return false  ;
    }
    return  true ;
}
    public static void Queenplace( List<String>board , List<List<String>> ans , int row  , int n ) {
        // if the  at the last row means we have  safe postion
        if( row == n ){
            ans.add(new ArrayList<>(board)) ;
            return;
        }
        for (int col =0 ; col < n ; col++ ) {
            if( isSafePostion( board , row , col , n )) {
                // queen place
                char []rowstr = board.get(row).toCharArray()  ;
                rowstr[col]='Q' ;
                board.set(row , new String(rowstr)) ;
                Queenplace(board , ans , row+1 , n );
                //backtrack
                rowstr[col] = '.' ;
                board.set(row , new String(rowstr)) ;
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {

        List<String>board = new ArrayList<>() ;
        String rowStr = ".".repeat(n) ;
        for( int i =0  ; i < n ; i++) {
            board.add(rowStr) ;
        }
        List<List<String>> ans  = new ArrayList<>() ;
        Queenplace( board , ans , 0 , n ) ;
        return  ans  ;
    }
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

}
