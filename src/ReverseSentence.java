import java.util.Stack;

public class ReverseSentence {
    public static String reverse(String arr) {
        Stack<String> s = new Stack<>();

        String word[] = arr.split(" ");

        String sentence = "";

        for(int i = 0; i < word.length; i++) {
            s.push(word[i]);
        }

        while (!s.empty()) {
            sentence += s.pop() + " ";
        }

        return sentence;
    }


    public static void main(String[] args) {
        String arr = "Where need is greatest";
        System.out.println(reverse(arr));
//        System.out.println("\n");
        String arr2 = "Simplicity is genius";
        System.out.println(reverse(arr2));
//        System.out.println("\n");

    }
}