package programmers.programmers1.test_61to80;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_76_PersonalInformation {
    public int[] solution(String today, String[] terms, String[] privacies) {
        //                  오늘 날짜, 유효기간(약관종류, 개월), 개인정보(수집일, 약관종류)
        List<Integer> answerList = new ArrayList<>();
        // 오늘 날짜 비교를 위해 정수형으로
        int[] todayToInt = {Integer.parseInt(today.substring(0, 4)),
                Integer.parseInt(today.substring(5, 7)),
                Integer.parseInt(today.substring(8, 10))};

        int[] date; // {년, 월, 일}
        int expirationDate; // 유효기간(개월)

        for (int i = 0; i < privacies.length; i++) {
            for (int j = 0; j < terms.length; j++) {
                if (privacies[i].charAt(11) == terms[j].charAt(0)) { // 항목이 동일하다면
                    date = new int[]{Integer.parseInt(privacies[i].substring(0, 4)), Integer.parseInt(privacies[i].substring(5, 7)), Integer.parseInt(privacies[i].substring(8, 10))};
                    expirationDate = Integer.parseInt(terms[j].substring(2));

                    date[1] += expirationDate;
                    while (date[1] > 12) {
                        date[1] -= 12;
                        date[0] += 1;
                    }

                    if (todayToInt[0] > date[0] ||
                            todayToInt[0] == date[0] && todayToInt[1] > date[1] ||
                            todayToInt[0] == date[0] && todayToInt[1] == date[1] && todayToInt[2] >= date[2]) {
                        answerList.add(i + 1);
                    }
                }
            }
        }

        // 리스트를 배열로
        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_76_PersonalInformation sol = new Test_76_PersonalInformation();
        // [1, 3]
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        // [1, 4, 5]
//        String today = "2020.01.01"; String[] terms = {"Z 3", "D 5"}; String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        System.out.println(Arrays.toString(sol.solution(today, terms, privacies)));
    }
}
