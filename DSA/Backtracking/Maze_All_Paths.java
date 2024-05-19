package DSA.Backtracking;

import java.util.ArrayList;

public class Maze_All_Paths {
    static void allPath(String p, int[][] maze, int r, int c){
        if(r==maze.length-1 && c== maze[0].length-1){
            if(maze[r][c]==1){
                System.out.println(p);
                return;
            }else{
                System.out.println(-1);
                return;
            }
        }
        if(maze[r][c]==0){
            return;
        }
        maze[r][c] = 0;
        if(r < maze.length-1){
            allPath(p+ 'D', maze,r+1,c);
        }
        if(c < maze[0].length-1){
            allPath(p+ 'R', maze,r,c+1);
        }
        if(r > 0){
            allPath(p+ 'U', maze,r-1,c);
        }
        if(c > 0){
            allPath(p+ 'L', maze,r,c-1);
        }
        maze[r][c] = 1;
    }
    static void pathList(String p, int[][] maze, int r, int c, ArrayList<String> paths){
        if(r==maze.length-1 && c== maze[0].length-1){
            if(maze[r][c]==1){
                paths.add(p);
                return;
            }else{
                return;
            }
        }
        if(maze[r][c]==0){
            return;
        }
        maze[r][c] = 0;
        ArrayList<String> ans = new ArrayList<>();
        if(r < maze.length-1){
            pathList(p+ 'D', maze,r+1,c,paths);
        }
        if(c < maze[0].length-1){
            pathList(p+ 'R', maze,r,c+1,paths);
        }
        if(r > 0){
            pathList(p+ 'U', maze,r-1,c,paths);
        }
        if(c > 0){
            pathList(p+ 'L', maze,r,c-1,paths);
        }
        maze[r][c] = 1;
    }
    public static void main(String[] args) {
        int[][] board = {
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        int[][] arr = {
                {1,0},
                {1,0}
        };
//        allPath("",board,0,0);
//        allPath("",arr,0,0);
        ArrayList<String> paths = new ArrayList<>();
        pathList("",arr,0,0,paths);
        System.out.println(paths);
    }
}
