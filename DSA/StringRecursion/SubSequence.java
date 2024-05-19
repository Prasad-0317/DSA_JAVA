package DSA.StringRecursion;

import java.util.ArrayList;

public class SubSequence {

    public static void main(String[] args) {
//        subseq("", "abc");
        System.out.println(subSeqList("" , "abc"));
    }

    static void subseq(String p ,String un){
        if(un.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char c = un.charAt(0);
        subseq(p+c, un.substring(1)); // substring creating new obj bcoz strings are immutable , it is not changing un & same
        // p + c is not changing p it is creating new one
        subseq(p, un.substring(1));

    }

    static ArrayList<String> subSeqList(String p , String un){
        if(un.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c = un.charAt(0);
        ArrayList<String> left = subSeqList(p+c, un.substring(1)); // substring creating new obj bcoz strings are immutable , it is not changing un & same
        // p + c is not changing p it is creating new one

        ArrayList<String> right = subSeqList(p, un.substring(1));
        left.addAll(right);
        return left;
    }
}
