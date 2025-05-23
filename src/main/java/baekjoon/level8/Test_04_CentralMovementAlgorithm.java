package baekjoon.level8;

import java.io.*;

public class Test_04_CentralMovementAlgorithm {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = toInt(br.readLine());

        // 4각형의 꼭지점의 개수는 4개
        // 한 변의 점의 개수는 2^N + 1
        // 총 점의 개수는 (2^N + 1)^2

        int side = (int) Math.pow(2, N) + 1;
        System.out.println(side * side);
    }
}
