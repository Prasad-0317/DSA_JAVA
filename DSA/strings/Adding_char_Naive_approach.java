package DSA.strings;

public class Adding_char_Naive_approach {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch; // series += ch
        }

        System.out.println(series);
    }
}
