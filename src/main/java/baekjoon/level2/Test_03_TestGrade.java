package baekjoon.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_03_TestGrade {
    static int N;

    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = stoi(st.nextToken());

        if (N >= 90) {
            System.out.println('A');
        } else if (N >= 80) {
            System.out.println('B');
        } else if (N >= 70) {
            System.out.println('C');
        } else if (N >= 60) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}
