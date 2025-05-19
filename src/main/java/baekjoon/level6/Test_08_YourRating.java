package baekjoon.level6;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Test_08_YourRating {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        double totalScore = 0.0;  // 평점 총합 = 학점 × 과목 평점
        double totalCredit = 0.0; // 총 학점 (P 제외)

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken(); // 과목명
            double credit = Double.parseDouble(st.nextToken()); // 학점
            String grade = st.nextToken(); // 등급

            // P는 계산에서 제외}
            if (grade.equals("P")) {
                continue;
            }

            double gradePoint = gradeMap.get(grade);
            totalScore += credit * gradePoint; // 학점 * 과목평점
            totalCredit += credit;
        }

        // 전공평점 = 전공과목별 (학점 × 과목평점)의 합 / 학점의 총 합
        double gpa = totalScore / totalCredit;
        System.out.printf("%.6f\n", gpa); // 소수점 6자리까지 출력
    }
}
