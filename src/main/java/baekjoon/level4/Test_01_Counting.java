package baekjoon.level4;

import java.io.*;
import java.util.StringTokenizer;

public class Test_01_Counting {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int n = toInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = toInt(st.nextToken());
        }

        int v = toInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if (arr[i] == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}
