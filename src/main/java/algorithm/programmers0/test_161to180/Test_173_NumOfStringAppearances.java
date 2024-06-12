package algorithm.programmers0.test_161to180;

public class Test_173_NumOfStringAppearances {
    public int solution(String myString, String pat) {
        int answer = 0;
        int lengOfPat = pat.length();

        for (int i = 0; i < myString.length() - lengOfPat + 1; i++) {
            if (myString.substring(i, i + lengOfPat).equals(pat)) {
                answer++;
            }
        }

        return answer;
    }
}
