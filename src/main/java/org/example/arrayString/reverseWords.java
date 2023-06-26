package org.example.arrayString;

public class reverseWords {
    public static String reverse(String s) {
        String[] str = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = str.length -1; i >= 0; i--) {
            if (str[i] != "") {
                result.append(str[i]);
                result.append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello  world"));
    }
}
