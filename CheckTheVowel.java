
public class CheckTheVowel {

    public static void main(String[] args) {

        String str = "Morning";
        String xo = str.toLowerCase();
        boolean hasVowel = false;

        for (int i = 0; i < xo.length(); i++) {
            char ch = xo.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                hasVowel = true;
                break;
            }
        }

        if (hasVowel) {
            System.out.println("The string contains a vowel");
        } else {
            System.out.println("The string does not contain any vowel");
        }
    }
}
