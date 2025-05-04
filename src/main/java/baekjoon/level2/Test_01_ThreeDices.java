package baekjoon.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_01_ThreeDices {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = stoi(st.nextToken());
        int second = stoi(st.nextToken());
        int third = stoi(st.nextToken());

        int reward;

        if (first == second && second == third) {
            // 3개 모두 같은 경우
            reward = 10000 + first * 1000;
        } else if (first == second || first == third) {
            // a가 b 또는 c와 같은 경우
            reward = 1000 + first * 100;
        } else if (second == third) {
            // b와 c만 같은 경우
            reward = 1000 + second * 100;
        } else {
            // 모두 다른 경우
            int max = Math.max(first, Math.max(second, third));
            reward = max * 100;
        }

        System.out.println(reward);
    }
}
