package baekjoon.level5;

import java.io.*;

public class Test_03_String {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = toInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String word = br.readLine();
            System.out.println("" + word.charAt(0) + word.charAt(word.length() - 1));
        }
    }
}
