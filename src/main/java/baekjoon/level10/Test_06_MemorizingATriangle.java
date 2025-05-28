package baekjoon.level10;

import java.io.*;

public class Test_06_MemorizingATriangle {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = toInt(br.readLine());
        int b = toInt(br.readLine());
        int c = toInt(br.readLine());

        if (a + b + c != 180) {
            System.out.println("Error");
        } else if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
