package baekjoon.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_10_Multiplication {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = stoi(br.readLine());
        int b = stoi(br.readLine());

        int b1 = b % 10;
        int b10 = (b / 10) % 10;
        int b100 = b / 100;

        System.out.println(a * b1);
        System.out.println(a * b10);
        System.out.println(a * b100);
        System.out.println(a * b);
    }
}
