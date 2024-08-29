package programmers.programmers0.test_121to140;

import java.util.Scanner;

public class Test_139_DistinguishingOddity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? n + " is even" : n + " is odd");
    }
}
