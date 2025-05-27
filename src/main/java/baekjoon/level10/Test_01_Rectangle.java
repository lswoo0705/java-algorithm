package baekjoon.level10;

import java.io.*;

public class Test_01_Rectangle {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = toInt(br.readLine());
        int B = toInt(br.readLine());

        System.out.println(A * B);
    }
}
