public class SplitSentence {
    public static void main(String[] args) {
        String sentence = "Hi myself sumanth!!";
        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}