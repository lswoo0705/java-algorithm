package programmers.programmers0.test_181to200;

public class Test_186_CharacterCounting {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char alphabet = my_string.charAt(i);

            if (alphabet >= 'A' && alphabet <= 'Z') {
                answer[alphabet - 'A']++;
            } else if (alphabet >= 'a' && alphabet <= 'z') {
                answer[26 + alphabet - 'a']++;
            }
        }

        return answer;
    }
}
