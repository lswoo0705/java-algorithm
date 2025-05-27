package baekjoon.level10;

import java.io.*;
import java.util.StringTokenizer;

public class Test_02_EscapeFromRectangle {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = toInt(st.nextToken());
        int y = toInt(st.nextToken());
        int w = toInt(st.nextToken());
        int h = toInt(st.nextToken());

        int xMin = 0;
        int yMin = 0;

        xMin = Math.min(x, w - x);
        yMin = Math.min(y, h - y);

        System.out.println(Math.min(xMin, yMin));
    }
}
