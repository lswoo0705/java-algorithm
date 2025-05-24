package baekjoon.level9;

import java.io.*;
import java.util.StringTokenizer;

public class Test_01_DivisorAndMultiple {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);
            int A = toInt(st.nextToken());
            int B = toInt(st.nextToken());

            if (A == 0 && B == 0) {
                break;
            }

            if (B % A == 0) {
                System.out.println("factor");
            } else if (A % B == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}
