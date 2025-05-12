package baekjoon.level4;

import java.io.*;
import java.util.StringTokenizer;

public class Test_02_NumLessThanX {

    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 줄: n과 x
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = toInt(st.nextToken());
        int x = toInt(st.nextToken());

        // 둘째 줄: 배열 a
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int a = toInt(st.nextToken());
            if (a < x) {
                bw.write(a + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
