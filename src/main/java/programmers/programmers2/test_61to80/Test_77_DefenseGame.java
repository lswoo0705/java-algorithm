package programmers.programmers2.test_61to80;

public class Test_77_DefenseGame {
    public int solution(int n, int k, int[] enemy) {
        int rounds = 0;
        int[] largestEnemies = new int[k]; // 무적권을 사용한 가장 큰 enemy 값 저장

        for (int i = 0; i < enemy.length; i++) {
            n -= enemy[i]; // 병사 소모

            if (n < 0) { // 병사가 부족한 경우
                if (k > 0) {
                    // 지금까지 나온 적 중 가장 큰 적을 무적권으로 치환
                    int maxIdx = -1, maxValue = -1;
                    for (int j = 0; j < i; j++) { // 이전 라운드 중 최대 적 탐색
                        if (enemy[j] > maxValue) {
                            maxValue = enemy[j];
                            maxIdx = j;
                        }
                    }

                    if (maxIdx != -1) {
                        // 가장 큰 적을 무적권으로 막고 병사 복구
                        n += maxValue;
                        enemy[maxIdx] = -1; // 이미 무적권 사용한 라운드는 -1로 표시
                        k--;
                    } else {
                        break; // 무적권을 쓸 수 없으면 종료
                    }
                } else {
                    break; // 병사도 없고 무적권도 없으면 종료
                }
            }

            rounds++;
        }

        return rounds;
    }
}
