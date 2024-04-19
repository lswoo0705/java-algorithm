package algorithm.programmers0.test_121to140;

public class Test_124_FindDesiredString {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}
