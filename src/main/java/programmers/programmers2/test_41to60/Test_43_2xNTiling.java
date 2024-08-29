package programmers.programmers2.test_41to60;

public class Test_43_2xNTiling {
    public int solution(int n) {
        int[] answer = new int[n + 1];

        answer[0] = 1; // 타일이 사용되지 않는 방법
        answer[1] = 1; // 세로로 배치하는 방법

        // 연산의 오버플로우를 막기 위해 모듈러 값(연산 가능한 가장 큰 소수)을 설정
        int modular = 1_000_000_007;

        // 가로 길이가 i인 직사각형을 채우는 방법
        // 1. 가로 길이가 i-1인 직사각형을 만들고 그 옆에 세로로 타일 하나를 놓는 방법 (answer[i-1])
        // 2. 가로 길이가 i-2인 직사각형을 만들고 그 옆에 가로로 타일 두 개를 놓는 방법 (answer[i-2])
        for (int i = 2; i <= n; i++) {
            answer[i] = (answer[i - 1] + answer[i - 2]) % modular;
        }

        // 결과 반환
        return answer[n];
    }
}
