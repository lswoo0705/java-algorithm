package programmers.programmers2.test_81to100;

public class Test_85_MakingAPoint { // 점 찍기
    public long solution(int k, int d) {
//        long answer = 0;
//        int distance = d * d;
//
//        // 2중 for문으로 a와 b가 증가할 때 d 이하인 좌표인 경우에만 추가
//        for (int x = 0; x <= d; x++) {
//            for (int y = 0; y <= d; y++) {
//                // d 이하의 거리인 좌표 확인은 (d의 제곱) >= (x의 제곱) + (y의 제곱)으로 확인
//                if ((x * k) * (x * k) + (y * k) * (y * k) <= distance) {
//                    answer++;
//                }
//            }
//        }
//
//        return answer;
//
//        // ----------- 정확성 : 6.3 / 100.0 -> 실패(시간초과) -----------
//        // 시간복잡도 개선 필요!!

        long answer = 0;

        for (int x = 0; x <= d; x += k) {
            // x 좌표가 고정되었을 때, 가능한 y 좌표의 개수를 구함
            // (x^2 + y^2 <= d^2) 이므로 y^2 <= d^2 - x^2
            long maxY = (long) Math.sqrt((long)d * d - (long)x * x);
            answer += (maxY / k) + 1; // 0부터 시작이므로 +1
        }

        return answer;
    }
}
