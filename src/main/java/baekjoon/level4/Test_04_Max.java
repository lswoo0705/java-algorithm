package baekjoon.level4;

import java.io.*;

public class Test_04_Max {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = toInt(br.readLine());
        }

        int maxNum = arr[0];
        int index = 0;

        for (int i = 1; i < 9; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                index = i;
            }
        }

        bw.write(maxNum + "\n");
        bw.write(String.valueOf(index + 1));

        bw.flush();
        bw.close();
    }
}
