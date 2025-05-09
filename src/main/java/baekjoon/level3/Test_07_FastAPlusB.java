package baekjoon.level3;

import java.io.*;
import java.util.StringTokenizer;

public class Test_07_FastAPlusB {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = stoi(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int sum = stoi(st.nextToken()) + stoi(st.nextToken());
            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
    }
}
