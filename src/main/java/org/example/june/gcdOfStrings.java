package org.example.june;

public class gcdOfStrings {
    public static String gcdOfStrings(String s1, String s2) {
        if (!(s1 + s2).equals(s2 + s1))
            return "";
        int gcd = gcd(s1.length(), s2.length());
        return s1.substring(0, gcd);

    }

    private static  int gcd(int l1, int l2) {
        return l2 == 0 ? l1 : gcd (l2, l1 % l2);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }
}
