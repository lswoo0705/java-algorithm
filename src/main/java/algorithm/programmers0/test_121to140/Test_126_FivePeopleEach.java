package algorithm.programmers0.test_121to140;

public class Test_126_FivePeopleEach {
    public String[] solution(String[] names) {
//        String[] answer = new String[names.length / 5 + 1];
//
//        for (int i = 0; i < names.length / 5 + 1; i++) {
//            answer[i] = names[5 * i];
//        }
//
//        return answer;
        // 런타임에러

        String[] answer = new String[(names.length + 4) / 5];

        for (int i = 0; i < (names.length + 4) / 5; i++) {
            if (5 * i < names.length) {
                answer[i] = names[5 * i];
            }
        }

        return answer;
    }
}
