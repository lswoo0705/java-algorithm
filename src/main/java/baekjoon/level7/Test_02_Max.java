package baekjoon.level7;

import java.io.*;
import java.util.StringTokenizer;

public class Test_02_Max {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxNum = -1;
        String maxIndex = "";

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int curNum = toInt(st.nextToken());
                if (curNum > maxNum) {
                    maxNum = curNum;
                    maxIndex = (i + 1) + " " + (j + 1);
                }
            }
        }

        bw.write(String.valueOf(maxNum));
        bw.newLine();
        bw.write(maxIndex);

        bw.flush();
        bw.close();
    }
}