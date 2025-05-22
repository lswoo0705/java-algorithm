package baekjoon.level8;

import java.io.*;
import java.util.StringTokenizer;

public class Test_02_PositionalNumeralSystemConversion2 {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = toInt(st.nextToken());
        int b = toInt(st.nextToken());

        System.out.println(Integer.toString(n, b).toUpperCase());
    }
}
