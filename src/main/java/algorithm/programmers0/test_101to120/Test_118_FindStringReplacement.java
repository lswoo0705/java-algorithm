package algorithm.programmers0.test_101to120;

public class Test_118_FindStringReplacement {
    public int solution(String myString, String pat) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                newString.append('B');
            } else if (myString.charAt(i) == 'B') {
                newString.append('A');
            }
        }

        return newString.toString().contains(pat) ? 1 : 0;
    }
}
