package ratInMazeproblemgfg;

import java.util.ArrayList;
import java.util.Collections;


class Solution {


    static void  helper(int [][] maze , int r , int c , String path , ArrayList<String>list  , boolean [][]back  )  {
        // base case
        int n  = maze.length  ;
        if( r<0 || c<0 ||  r>= n  ||  c>= n || maze[r][c] == 0 || back[r][c]== true ) {
            return ;
        }
        if(  r==n-1 && c==n-1 ) {
            list.add( new String(path) )   ;
            return  ;
        }

        back[r][c] = true  ;

        helper( maze , r-1 , c , path+"U" , list ,back  ) ; // up
        helper( maze , r , c+1 , path+"R" , list ,back  ) ;// right
        helper( maze , r+1 , c , path+"D" , list ,back  ) ;//down
        helper( maze , r, c-1 ,  path+"L" , list ,back  ) ;// left

        back[r][c] = false  ;

    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here

        ArrayList<String>list = new ArrayList<>() ;
        if(maze[0][0]== 0  ) return  list  ;
        String path = "";
        // for trcking of path
        int n  = maze.length ;
        boolean[][] back = new boolean[n][n];

        helper( maze , 0 , 0 , path , list ,back  ) ;
        Collections.sort(list) ;
        return list  ;


    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        System.out.println(sol.ratInMaze(maze));
    }
}
