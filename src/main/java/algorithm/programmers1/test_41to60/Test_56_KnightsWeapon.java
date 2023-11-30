package algorithm.programmers1.test_41to60;

public class Test_56_KnightsWeapon {
    public int solution(int number, int limit, int power) {
        // 시간 초과로 실패 코드
        /*
        int answer = 0;
        int[] knightNum = new int[number];
        int[] knightPower = new int[number];

        for (int i = 0; i < number; i++) {
            // 기사들의 번호 배열 생성
            knightNum[i] = i + 1;

            // 기사들의 원래 공격력 배열
            for (int j = 0; j < knightNum[i]; j++) {
                if (knightNum[i] % (j + 1) == 0) {
                    knightPower[i]++;
                }
            }

            // 제한 공격력을 적용한 공격력 배열로 변경
            if (knightPower[i] > limit) {
                knightPower[i] = power;
            }

            // 공격력을 모두 합산
            answer += knightPower[i];
        }

        return answer;
        */


        // 속도 개선하여 성공(코드가 복잡)
        /*
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int knightPower = calculateKnightPower(i);

            // 제한 공격력을 적용
            if (knightPower > limit) {
                knightPower = power;
            }

            // 공격력을 모두 합산
            answer += knightPower;
        }

        return answer;
    }

    private int calculateKnightPower(int knightNum) {
        if (knightNum == 1) {
            return 1;
        }

        // 기사의 공격력 초기값 (1과 자기 자신을 포함)
        int knightPower = 2;

        // 제곱근까지만 반복하여 약수 계산
        int sqrtNum = (int) Math.sqrt(knightNum);
        for (int j = 2; j <= sqrtNum; j++) {
            if (knightNum % j == 0) {
                int otherDivisor = knightNum / j;
                knightPower += (j == otherDivisor) ? 1 : 2;
            }
        }

        return knightPower;
        */


        // 다른사람의 풀이(위에 코드보다 10배는 빠름)
        int answer = 0;
        int[] count = new int[number + 1];

        // 바로 약수의 개수를 배열에 넣기
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }

        // 공격력 판별 후 answer에 바로 더하기
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }

        return answer;
    }
}
