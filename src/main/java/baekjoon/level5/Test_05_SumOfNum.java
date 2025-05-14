package baekjoon.level5;

import java.io.*;

public class Test_05_SumOfNum {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = toInt(br.readLine());
        int sum = 0;
        String word = br.readLine();

        for (int i = 0; i < n; i++) {
            sum += toInt(String.valueOf(word.charAt(i)));
        }

        System.out.println(sum);
    }
}
