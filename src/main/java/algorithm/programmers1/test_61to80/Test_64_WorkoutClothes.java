package algorithm.programmers1.test_61to80;

import java.util.Arrays;

public class Test_64_WorkoutClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // 학생들의 수만큼 배열 생성
        int[] arr = new int[n];
        // 모두 체육복이 있다 생각하고 1로 채움
        Arrays.fill(arr, 1);

        // 체육복의 여분이 있는 학생들은 1을 추가해서 2로
        for (int i = 0; i < reserve.length; i++) {
            arr[reserve[i] - 1] = 2;
        }

        // 체육복이 도난당한 학생들은 1을 빼서 0으로
        for (int i = 0; i < lost.length; i++) {
            arr[lost[i] - 1] -= 1;
        }

        // 만약 i번째 학생이 체육복이 도난당해서 0개이고, 앞이나 뒤에학생이 2개라면 빌려옴
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0 && arr[i + 1] == 2) {
//                arr[i] = 1;
//                arr[i + 1] = 1;
//            } else if (arr[i] == 0 && arr[i - 1] == 2) {
//                arr[i] = 1;
//                arr[i - 1] = 1;
//            }
//        }
        // -> 속도개선 필요

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                if (i - 1 >= 0 && arr[i - 1] > 1) {
                    arr[i]++;
                    arr[i - 1]--;
                } else if (i + 1 < n && arr[i + 1] > 1) {
                    arr[i]++;
                    arr[i + 1]--;
                }
            }
        }

        // 체육복이 1개 이상인 학생들의 수를 더함
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 1) {
                answer++;
            }
        }

        return answer;
    }
}
