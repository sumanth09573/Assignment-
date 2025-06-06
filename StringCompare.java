public class StringCompare {
    public static void main(String[] args) {
        String str1 = "sumanth";
        String str2 = "Sumanth";

        if (str1.equals(str2)) {
            System.out.println("Strings are equal (ignoring case)");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}