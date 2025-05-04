package baekjoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_01_APlusBMinus4 {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (br.readLine() != null) {
            int a = stoi(st.nextToken());
            int b = stoi(st.nextToken());

            System.out.println(a + b);
        }
    }
}
