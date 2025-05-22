package baekjoon.level8;

//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Test_01_PositionalNumeralSystemConversion2 {
//    static int convertChar(char c) {
//        if ('0' <= c && c <= '9') {
//            return c - '0';
//        } else {
//            return c - 55;
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        String num = st.nextToken();
//        int base = Integer.parseInt(st.nextToken());
//
//        long answer = 0;
//        for (int i = 0; i < num.length(); i++) {
//            char c = num.charAt(i);
//            int value = convertChar(c);
//            answer = answer * base + value;
//        }
//
//        System.out.println(answer);
//    }
//}

import java.io.*;
import java.util.StringTokenizer;

public class Test_01_PositionalNumeralSystemConversion {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String num = st.nextToken();
        int b = toInt(st.nextToken());
        Long answer = Long.parseLong(num, b);

        System.out.println(answer);
    }
}
