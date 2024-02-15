package DSA.StringRecursion;

import java.util.ArrayList;

public class Permutation {
    static void permutation(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        for(int i=0; i<= p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f+c+s , up.substring(1));
        }
    }
    static ArrayList<String> permutationList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        // local to this call
        ArrayList<String> ans = new ArrayList<>();
        char c = up.charAt(0);
        for(int i=0; i<= p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationList(f+c+s , up.substring(1)));
        }
        return ans;
    }
    static int permutationCount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        char c = up.charAt(0);
        int count = 0;
        for(int i=0; i<= p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count+ permutationCount(s+c+f , up.substring(1));
        }
        return count;
    }
    public static void main(String[] args) {
//        permutation("","abc");
        System.out.println(permutationList("","abc"));
//        System.out.println(permutationCount("","abcdd"));
    }
}
