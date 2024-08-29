package programmers.programmers1.test_61to80;

public class Test_61_RankingOfLotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 6 / 45 번호 맞추기, 번호는 1~45
        // 1위 : 6개
        // 2위 : 5개
        // 3위 : 4개
        // 4위 : 3개
        // 5위 : 2개
        // 낙첨 : 그외
        // 내가 가능한 최고순위와 최저순위
        int[] answer = {6, 6};
        int zeroCount = 0;
        int answerCount = 0;

        // 0의 개수를 카운트
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
            }
        }

        // 일치하는 번호 카운트
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    answerCount++;
                }
            }
        }

        // 최고순위
        // 일치하는 숫자 + 0의 개수로 순위 측정
        switch (zeroCount + answerCount) {
            case 6 -> answer[0] = 1;
            case 5 -> answer[0] = 2;
            case 4 -> answer[0] = 3;
            case 3 -> answer[0] = 4;
            case 2 -> answer[0] = 5;
        }

        // 최저순위
        // 일치하는 숫자로만 순위측정
        switch (answerCount) {
            case 6 -> answer[1] = 1;
            case 5 -> answer[1] = 2;
            case 4 -> answer[1] = 3;
            case 3 -> answer[1] = 4;
            case 2 -> answer[1] = 5;
        }

        return answer;
    }
}
