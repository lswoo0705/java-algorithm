package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;

    // 문자열을 정수로
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        // 문제에서 주어진 문자열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 문제에서 주어진 문자열을 토큰으로 나눈 문자열
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 첫 토큰의 정수형
        N = toInt(st.nextToken());
    }
}
