package org.example.june;

import java.util.Arrays;

public class stringCompression {
    public static int compress(char[] chars) {
        int j = 0;
        if (chars.length == 1) return 1;

        for (int i = 1; i < chars.length; i++) {
            int cnt = 1;
            while (i < chars.length && chars[i] == chars[i - 1]) {
                cnt++;
                i++;
            }
            chars[j++] = chars[i - 1];

            if (cnt > 1) {
                String c = String.valueOf(cnt);
                for (char ch : c.toCharArray()) {
                    chars[j++] = ch;
                }
            }

        }
        System.out.println(Arrays.toString(chars));
        return j;
    }

    public static void main(String[] args) {
        char[] test = new char[] {'a', 'a', 'b', 'b','b','b', 'c'};
        System.out.println(compress(test));
    }
}
