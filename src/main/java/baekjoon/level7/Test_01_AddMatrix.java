package baekjoon.level7;

import java.io.*;
import java.util.StringTokenizer;

public class Test_01_AddMatrix {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = toInt(st.nextToken());
        int column = toInt(st.nextToken());

        int[][] aArr = new int[row][column];
        int[][] bArr = new int[row][column];

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < column; j++) {
                aArr[i][j] = toInt(st.nextToken());
            }
        }

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < column; j++) {
                bArr[i][j] = toInt(st.nextToken());
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                bw.write(aArr[i][j] + bArr[i][j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
