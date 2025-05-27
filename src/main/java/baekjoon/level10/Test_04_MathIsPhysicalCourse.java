package baekjoon.level10;

import java.io.*;

public class Test_04_MathIsPhysicalCourse {
    static int N;

    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = toInt(br.readLine());

        // 한 줄이 늘어나면 + 3 + 밑줄길이
        // 3 + 1 -> 6 + 2 -> 9 + 3

        System.out.println(n * 3 + n);
    }
}
