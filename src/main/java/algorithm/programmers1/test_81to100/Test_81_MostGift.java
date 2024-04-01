package algorithm.programmers1.test_81to100;

import java.util.Arrays;

public class Test_81_MostGift {
    public int solution(String[] friends, String[] gifts) {
        // 받을 선물의 개수
        int[] giftToReceive = new int[friends.length];
        // 선물 주고받은 내역 계산 -> 2차원 배열로
        int[][] present = new int[friends.length][friends.length];
        // 준선물, 받은선물, 선물지수 계산
        int[][] giftChart = new int[friends.length][3];

        String[] giverAndRecipient = new String[2]; // 주는사람, 받는사람
        for (String gift : gifts) {
            giverAndRecipient = gift.split(" ");
            int giver = Arrays.asList(friends).indexOf(giverAndRecipient[0]); // 주는사람의 friends의 인덱스
            int recipient = Arrays.asList(friends).indexOf(giverAndRecipient[1]); // 받는사람의 friends의 인덱스
            present[giver][recipient]++;

            // 준선물, 받은선물 계산
            giftChart[giver][0]++;
            giftChart[recipient][1]++;
        }

        // 선물지수 계산
        for (int i = 0; i < friends.length; i++) {
            giftChart[i][2] = giftChart[i][0] - giftChart[i][1];
        }

        //  주고받은 내역으로 다음달 선물 계산 present
        for (int i = 0; i < friends.length - 1; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                if (present[i][j] > present[j][i]) {
                    giftToReceive[i]++;
                } else if (present[i][j] < present[j][i]) {
                    giftToReceive[j]++;
                } else if (present[i][j] == present[j][i] ||
                        (present[i][j] == 0 && present[j][i] == 0)) {
                    if (giftChart[i][2] > giftChart[j][2]) {
                        giftToReceive[i]++;
                    } else if (giftChart[i][2] < giftChart[j][2]) {
                        giftToReceive[j]++;
                    }
                }
            }
        }

        int answer = giftToReceive[0];
        for (int i = 1; i < giftToReceive.length; i++) {
            if (giftToReceive[i] > answer) {
                answer = giftToReceive[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_81_MostGift sol = new Test_81_MostGift();
//        String[] friends = {"muzi", "ryan", "frodo", "neo"};
//        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        String[] friends = {"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        System.out.println(sol.solution(friends, gifts));
    }
}
