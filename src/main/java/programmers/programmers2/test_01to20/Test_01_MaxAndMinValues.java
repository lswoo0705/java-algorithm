package programmers.programmers2.test_01to20;

public class Test_01_MaxAndMinValues {
    public String solution(String s) {
        String[] sArr = s.split(" ");

        int minNum = Integer.parseInt(sArr[0]);
        int maxNum = Integer.parseInt(sArr[1]);

        for (String value : sArr) {
            int num = Integer.parseInt(value);
            if (minNum >= num) {
                minNum = num;
            }
            if (maxNum <= num) {
                maxNum = num;
            }
        }

        return minNum + " " + maxNum;
    }
}
