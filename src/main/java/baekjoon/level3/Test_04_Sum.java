package baekjoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_04_Sum {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = stoi(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer += i + 1;
        }

        System.out.println(answer);
    }
}
