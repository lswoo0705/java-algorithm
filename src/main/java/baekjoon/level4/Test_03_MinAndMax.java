package baekjoon.level4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test_03_MinAndMax {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = toInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = toInt(st.nextToken());
        }

        bw.write(Arrays.stream(arr).min().getAsInt() + " " + Arrays.stream(arr).max().getAsInt());

        bw.flush();
        bw.close();
    }
}
