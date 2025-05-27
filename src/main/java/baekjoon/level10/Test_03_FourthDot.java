package baekjoon.level10;

import java.io.*;
import java.util.StringTokenizer;

public class Test_03_FourthDot {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[3][2];
        int x;
        int y;

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                arr[i][j] = toInt(st.nextToken());
            }
        }

        if (arr[0][0] == arr[1][0]) {
            x = arr[2][0];
        } else if (arr[0][0] == arr[2][0]) {
            x = arr[1][0];
        } else {
            x = arr[0][0];
        }

        if (arr[0][1] == arr[1][1]) {
            y = arr[2][1];
        } else if (arr[0][1] == arr[2][1]) {
            y = arr[1][1];
        } else {
            y = arr[0][1];
        }

        System.out.println(x + " " + y);
    }
}
