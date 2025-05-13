package baekjoon.level4;

import java.io.*;
import java.util.StringTokenizer;

public class Test_06_ChangeTheBall {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int basket = toInt(st.nextToken());
        int balls = toInt(st.nextToken());
        int[] arr = new int[basket];

        for (int i = 0; i < basket; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < balls; i++) {
            st = new StringTokenizer(br.readLine());
            int aBall = toInt(st.nextToken()) - 1;
            int bBall = toInt(st.nextToken()) - 1;
            int aToB = arr[aBall];
            arr[aBall] = arr[bBall];
            arr[bBall] = aToB;
        }

        for (int i = 0; i < basket; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
