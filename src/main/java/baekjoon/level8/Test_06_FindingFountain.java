package baekjoon.level8;

import java.io.*;

public class Test_06_FindingFountain {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = toInt(br.readLine());
        int row = 1;
        int count = 1;

        // 각 줄의 끝 번호
        while (X > count) {
            row++;
            count += row;
        }

        // 현재 대각선의 시작 번호
        int start = count - row + 1;
        int indexInRow = X - start;

        int numerator = 0; // 분자
        int denominator = 0; // 분모

        // 지그제그이므로 짝/홀을 따로
        if (row % 2 == 0) {
            numerator = 1 + indexInRow;
            denominator = row - indexInRow;
        } else {
            numerator = row - indexInRow;
            denominator = 1 + indexInRow;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
