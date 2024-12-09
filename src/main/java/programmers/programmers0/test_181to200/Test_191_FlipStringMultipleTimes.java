package programmers.programmers0.test_181to200;

public class Test_191_FlipStringMultipleTimes {
    public String solution(String my_string, int[][] queries) {
        StringBuffer str = new StringBuffer(my_string);

        for (int[] query : queries) {
            int startIndex = query[0];
            int endIndex = query[1];

            while (startIndex < endIndex) {
                char ch = str.charAt(startIndex);
                str.setCharAt(startIndex, str.charAt(endIndex));
                str.setCharAt(endIndex, ch);
                startIndex++;
                endIndex--;
            }
        }

        return str.toString();
    }
}
