package baekjoon.level5;

import java.io.*;
import java.util.StringTokenizer;

public class Test_09_Constant {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        StringBuilder sbA = new StringBuilder(a);
        StringBuilder sbB = new StringBuilder(b);
        String reverseA = sbA.reverse().toString();
        String reverseB = sbB.reverse().toString();

        if (toInt(reverseA) > toInt(reverseB)) {
            System.out.println(reverseA);
        } else {
            System.out.println(reverseB);
        }
    }
}
