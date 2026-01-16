
public class ReverseTheString {

    static String reverseString(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return (reverseString(s).substring(0) + s.charAt(0));
    }

    public static void main(String[] args) {
        String j = "JAVA";
        // StringBuilder a = new StringBuilder(j);
        // System.out.println(a.reverse());

        // String x = "";
        // for (int i = j.length() - 1; i >= 0; i--) {
        //     x += j.charAt(i);
        // }
        // System.out.println(x);
        // char arr[] = j.toCharArray();
        // for (int i = (arr.length) - 1; i >= 0; i--) {
        //     System.out.print(arr[i]);
        // }
    }
}
