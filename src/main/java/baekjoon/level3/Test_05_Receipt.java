package baekjoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_05_Receipt {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalPrice = stoi(br.readLine());
        int n = stoi(br.readLine());
        int price = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            price += stoi(st.nextToken()) * stoi(st.nextToken());
        }

        if (totalPrice == price) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
