package DSA.StringRecursion;

public class skip_char {
//    static void skip(String ans, String og){
//        if(og.isEmpty()){
//            System.out.println(ans);
//            return;
//        }
//        char c = og.charAt(0);
//        if(c=='a'){
//            skip(ans, og.substring(1));
//        }else{
//            skip(ans+c, og.substring(1));
//        }
//    }
    static String skip(String og){
        if(og.isEmpty()){
            return "";
        }
        char c = og.charAt(0);
        if(c=='a'){
            return skip(og.substring(1));
        }else{
            return c+ skip( og.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(skip("aabdb"));
    }
}
