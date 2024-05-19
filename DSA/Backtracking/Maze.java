package DSA.Backtracking;

import java.util.ArrayList;

public class Maze {
    static int noPaths(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = noPaths(r-1,c);
        int right = noPaths(r,c-1);
        return left+right;
    }

    static void Path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
           Path(p+ 'D', r-1,c);
        }
        if(c>1){
            Path(p+ 'R', r,c-1);
        }
    }
    static ArrayList<String> PathRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1){
            ans.addAll(PathRet(p+ 'D', r-1,c));
        }
        if(c>1){
            ans.addAll(PathRet(p+ 'R', r,c-1));
        }
        return ans;
    }

    static ArrayList<String> PathRetDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1 && c>1){
            ans.addAll(PathRetDiagonal(p+ 'D', r-1,c-1));
        }
        if(r>1){
            ans.addAll(PathRetDiagonal(p+ 'V', r-1,c));
        }
        if(c>1){
            ans.addAll(PathRetDiagonal(p+ 'H', r,c-1));
        }
        return ans;
    }
    static void PathRestriction(String p, int[][] maze, int r, int c){
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
        if(r < maze.length-1){
            PathRestriction(p+ 'D', maze,r+1,c);
        }
        if(c < maze[0].length-1){
            PathRestriction(p+ 'R', maze,r,c+1);
        }
    }
    public static void main(String[] args) {
//        System.out.println(noPaths(3,3));
//        Path("",3,3);
//        System.out.println(PathRet("",3,3));
//        System.out.println(PathRetDiagonal("",3,3));
        int[][] board = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        int[][] arr = {
                {1,0},
                {1,0}
        };
//        PathRestriction("",board,0,0);
        PathRestriction("",arr,0,0);
    }
}
