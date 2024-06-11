package algorithm.programmers2.test_21to40;

public class Test_34_VowelDictionary {
    public int solution(String word) {
        int[] position = {781, 156, 31, 6, 1}; // 자리수 위치의 가중치
        char[] vowel = {'A', 'E', 'I', 'O', 'U'};

        int answer = word.length(); // 입력값의 길이만큼 값을 더함

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (word.charAt(i) == vowel[j]) {
                    answer += position[i] * j;
                    break;
                }
            }
        }

        return answer;
    }
}
