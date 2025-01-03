package programmers.programmers0.test_181to200;

import java.util.Scanner;

public class Test_198_PythagoreanTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = c * c - a * a;

        System.out.println(b_square);
    }
}
