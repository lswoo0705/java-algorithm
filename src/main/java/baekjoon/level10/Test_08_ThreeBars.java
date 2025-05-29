package baekjoon.level10;

import java.io.*;
import java.util.StringTokenizer;

public class Test_08_ThreeBars {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = toInt(st.nextToken());
        int b = toInt(st.nextToken());
        int c = toInt(st.nextToken());

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println(a + b + c);
        } else if (a + b > c && b + c > a && a + c <= b) {
            System.out.println(a + c + a + c - 1);
        } else if (a + c > b && b + c > a && a + b <= c) {
            System.out.println(a + b + a + b - 1);
        } else if (a + b > c && a + c > b && b + c <= a) {
            System.out.println(b + c + b + c - 1);
        }
    }
}
