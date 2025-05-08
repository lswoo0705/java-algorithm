package baekjoon.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_11_LittleJungmin {
    static long stoi(String s) {
        return Long.parseLong(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

//        int a = stoi(st.nextToken());
//        int b = stoi(st.nextToken());
//        int c = stoi(st.nextToken());
//
//        System.out.println(a + b + c);
        System.out.println(stoi(st.nextToken()) + stoi(st.nextToken()) + stoi(st.nextToken()));
    }
}

// 문제에서 주어진 a,b,c의 범위는 10^12(1조)까지이다.
// int는 2,147,483,647(21억)까지만 표현할 수 있으므로 런타임에러 발생
// int -> long으로 해결