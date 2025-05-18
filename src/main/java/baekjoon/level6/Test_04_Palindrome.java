package baekjoon.level6;

import java.io.*;

public class Test_04_Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        StringBuilder reverseWord = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord.append(word.charAt(i));
        }

        if (word.contentEquals(reverseWord)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
