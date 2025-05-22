package baekjoon.level8;

import java.io.*;

public class Test_03_OwnerOfLaundryDonghyuk {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = toInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int rest = toInt(br.readLine());

            int quarter = rest / 25;
            rest %= 25;

            int dime = rest / 10;
            rest %= 10;

            int nickel = rest / 5;
            rest %= 5;

            int penny = rest;

            bw.write(quarter + " " + dime + " " + nickel + " " + penny + "\n");
        }

        bw.flush();
        bw.close();
    }
}
