package baekjoon.level10;

import java.io.*;
import java.util.StringTokenizer;

public class Test_05_Earth {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfPoints = toInt(br.readLine());
        int[][] pointsArr = new int[numOfPoints][2];

        if (numOfPoints == 1) {
            System.out.println(0);
        } else {
            for (int i = 0; i < numOfPoints; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                pointsArr[i][0] = toInt(st.nextToken());
                pointsArr[i][1] = toInt(st.nextToken());
            }

            int xMin = pointsArr[0][0];
            int yMin = pointsArr[0][1];
            int xMax = pointsArr[0][0];
            int yMax = pointsArr[0][1];

            for (int i = 0; i < numOfPoints; i++) {
                xMin = Math.min(xMin, pointsArr[i][0]);
                yMin = Math.min(yMin, pointsArr[i][1]);
                xMax = Math.max(xMax, pointsArr[i][0]);
                yMax = Math.max(yMax, pointsArr[i][1]);
            }

            System.out.println((xMax - xMin) * (yMax - yMin));
        }
    }
}
