public class StringComparator {
    public static int compareStrings(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return -1;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return i;
            }
        }

        if (str1.equals(str2)) {
            return 0;
        }

        return str2.length();
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        int result = compareStrings(str1, str2);
        if (result == 0) {
            System.out.println("Strings are equal");
        } else if (result == -1) {
            System.out.println("Second string's size is more than the first");
        } else {
            System.out.println("Strings are not equal, difference found at position: " + result);
        }
    }
}
