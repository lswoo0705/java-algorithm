package baekjoon.level10;

import java.io.*;
import java.util.StringTokenizer;

public class Test_07_TriangleAndThreeSides {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = toInt(st.nextToken());
            int b = toInt(st.nextToken());
            int c = toInt(st.nextToken());

            if (a == 0) {
                break;
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("Invalid");
            } else if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
