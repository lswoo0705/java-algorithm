package baekjoon.level3;

import java.io.*;
import java.util.StringTokenizer;

public class Test_12_APlusB5 {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = toInt(st.nextToken());
            int b = toInt(st.nextToken());
            int sum = a + b;

            if (a == 0 && b == 0) {
                break;
            }

            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
    }
}
