package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;

    // 문자열을 정수로
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        // 빠른 입/출력을 위해 BufferedReader와 BufferedWriter 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 문제에서 주어진 문자열을 토큰으로 나눈 문자열
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 첫 토큰의 정수형
        N = toInt(st.nextToken());

        // flush()로 작성된 BufferedWriter를 한번에 출력
        bw.flush();
        // 더 이상의 출력이 없으므로 자원을 해제하기 위해 호출
        bw.close();
    }
}
