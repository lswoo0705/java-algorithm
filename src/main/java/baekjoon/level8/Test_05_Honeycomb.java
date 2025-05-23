package baekjoon.level8;

import java.io.*;

public class Test_05_Honeycomb {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = toInt(br.readLine());
        int sideNum = 1;
        int distance = 1;

        while (sideNum < N) {
            sideNum += 6 * distance;
            distance++;
        }

        System.out.println(distance);
    }
}
