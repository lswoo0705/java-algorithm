package baekjoon.level1;

import java.util.Scanner;

public class Test_06_FourFundamentalArithmeticOperations {

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
    }

    public static void main(String[] args) {
        solution();
    }

}
