package baekjoon.level4;

import java.io.*;

public class Test_07_WhoDidNotSubmitTheAssignment {
    public static void main(String[] args) throws IOException {
        boolean[] submitted = new boolean[30];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            submitted[n - 1] = true;
        }

        for (int i = 0; i < 30; i++) {
            if (!submitted[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
