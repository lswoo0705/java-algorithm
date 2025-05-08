package baekjoon.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_02_CompareTwoNum {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = stoi(st.nextToken());
        int b = stoi(st.nextToken());

        if (a > b) {
            System.out.println('>');
        } else if (a < b) {
            System.out.println('<');
        } else {
            System.out.println("==");
        }
    }
}
