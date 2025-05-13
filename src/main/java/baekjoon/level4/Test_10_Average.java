package baekjoon.level4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test_10_Average {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 과목 수
        int subjects = toInt(br.readLine());

        // 점수표
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] gradeChart = new int[subjects];

        for (int i = 0; i < subjects; i++) {
            gradeChart[i] = toInt(st.nextToken());
        }

        // 최대 점수 찾기
        int maxGrade = Arrays.stream(gradeChart).max().getAsInt();

        // 조작된 점수 합
        double totalGrade = 0;
        for (int i = 0; i < subjects; i++) {
            totalGrade += (double) gradeChart[i] / maxGrade * 100;
        }

        System.out.println(totalGrade / subjects);
    }
}
