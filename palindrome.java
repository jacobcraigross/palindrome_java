public class palindrome {
    public static void main(String[] args) {

        // ex: "mom" = true, "dad" = true; "jacob" = false, "hello world" = false, "race car" = true;

        String word = "race car";
        word = word.replace(" ", "");
        String reversedWord = "";

        // loop through backwards.
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        // assume every word is a palindrome. then loop through fwd, if the 1st letter doesn't match, it's not.
        boolean palindrome = true;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != reversedWord.charAt(i)) {
                palindrome = false;
            }
        }

        if (palindrome) {
            System.out.println("Yes its a palindrome.");
        } else {
            System.out.println("No its not a palindrome.");
        }
    }
}
