package baekjoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_01_APlusB4 {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        while (br.readLine() != null) {
//            int a = stoi(st.nextToken());
//            int b = stoi(st.nextToken());
//
//            System.out.println(a + b);
//        }
//    }

    // 런타임 에러 : 반복문이 반복될 때마다 StringTokenizer 호출하므로

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력이 있을 때 반복
        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);

            int a = stoi(st.nextToken());
            int b = stoi(st.nextToken());

            System.out.println(a + b);
        }
    }
}
