package week6;

public class Class6_23_2 {
    public static void main(String[] args) {
        replaceLikeWithLove("I like u");
    }

    public static String replaceLikeWithLove(String text) {
        String value = text.replaceAll("like", "love");
        return  value;
    }
}
