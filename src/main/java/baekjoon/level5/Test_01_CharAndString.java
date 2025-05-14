package baekjoon.level5;

import java.io.*;

public class Test_01_CharAndString {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int i = toInt(br.readLine());

        System.out.println(s.charAt(i - 1));
    }

}
