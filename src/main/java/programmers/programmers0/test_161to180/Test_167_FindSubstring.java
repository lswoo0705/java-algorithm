package programmers.programmers0.test_161to180;

public class Test_167_FindSubstring {
    public String solution(String myString, String pat) {
        int index = myString.lastIndexOf(pat) + pat.length();
        
        return myString.substring(0, index);
    }
}
