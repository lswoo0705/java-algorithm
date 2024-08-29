package programmers.programmers1.test_21to40;

public class Test_36_CaesarCipher {
    public String solution(String s, int n) {
        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] >= 'A' && charArr[i] <= 'Z') { // 대문자 범위
                charArr[i] = (char) ((charArr[i] - 'A' + n) % 26 + 'A');
            } else if (charArr[i] >= 'a' && charArr[i] <= 'z') { // 소문자 범위
                charArr[i] = (char) ((charArr[i] - 'a' + n) % 26 + 'a');
            }
        }

        return new String(charArr);
    }
    // 풀이 과정
    // https://velog.io/@lswoo0705/%EC%8B%9C%EC%A0%80-%EC%95%94%ED%98%B8
}
