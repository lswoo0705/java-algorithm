package baekjoon.level4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test_05_PutTheBallIn {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = toInt(st.nextToken());
        int m = toInt(st.nextToken());
        int[] arr = new int[n];

        for (int ball = 0; ball < m; ball++) {
            st = new StringTokenizer(br.readLine());
            int i = toInt(st.nextToken());
            int j = toInt(st.nextToken());
            int k = toInt(st.nextToken());

            Arrays.fill(arr, i - 1, j, k);
        }

        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
