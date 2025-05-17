package baekjoon.level6;

import java.io.*;
import java.util.StringTokenizer;

public class Test_02_Chess {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] chess = new int[]{1, 1, 2, 2, 2, 8};

        for (int j : chess) {
            int count = toInt(st.nextToken());
            bw.write(j - count + " ");
        }

        bw.flush();
        bw.close();
    }
}
