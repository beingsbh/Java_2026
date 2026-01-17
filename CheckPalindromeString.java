
public class CheckPalindromeString {

    public static void main(String[] args) {
        String str = "XOOX";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("The String Is Palindrome");
        } else {
            System.out.println("The String Is Not Plaindrome");
        }
    }

}
