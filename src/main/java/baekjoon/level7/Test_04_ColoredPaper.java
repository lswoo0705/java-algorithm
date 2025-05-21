package baekjoon.level7;

import java.io.*;
import java.util.StringTokenizer;

public class Test_04_ColoredPaper {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfPaper = toInt(br.readLine());
        int[][] whitePaperArr = new int[100][100];
        int colorPaperArea = 0;

        for (int i = 0; i < numOfPaper; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int XPoint = toInt(st.nextToken());
            int YPoint = toInt(st.nextToken());
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    whitePaperArr[XPoint + j][YPoint + k] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (whitePaperArr[i][j] == 1) {
                    colorPaperArea++;
                }
            }
        }

        System.out.println(colorPaperArea);
    }
}
