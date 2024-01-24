package algorithm.programmers1.test_41to60;

public class Test_59_Babbling {
    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            if (babbling[i].contains("ayaaya")
                    || babbling[i].contains("yeye")
                    || babbling[i].contains("woowoo")
                    || babbling[i].contains("mama")) {
                continue;
            }

            babbling[i] = babbling[i].replaceAll("aya", " ");
            babbling[i] = babbling[i].replaceAll("ye", " ");
            babbling[i] = babbling[i].replaceAll("woo", " ");
            babbling[i] = babbling[i].replaceAll("ma", " ");
            babbling[i] = babbling[i].replaceAll(" ", "");

            if (babbling[i].isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
