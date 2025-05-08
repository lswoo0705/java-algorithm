package baekjoon.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_04_LeapYear {
    static int N;

    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = stoi(br.readLine());

        if (N % 4 == 0 && N % 100 != 0 || N % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
