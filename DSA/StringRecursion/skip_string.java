package DSA.StringRecursion;

public class skip_string {
    static String skipApple(String og){
        if(og.isEmpty()){
            return "";
        }
        char c = og.charAt(0);
        if(og.startsWith("apple")){
            return skipApple(og.substring(5));
        }else{
            return c+ skipApple( og.substring(1));
        }
    }
    static String skipAppNotApple(String og){
        if(og.isEmpty()){
            return "";
        }
        char c = og.charAt(0);
        if(og.startsWith("app") && !og.startsWith("apple")){
            return skipAppNotApple(og.substring(3));
        }else{
            return c+ skipAppNotApple( og.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("chalappzuta"));
    }
}
