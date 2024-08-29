package programmers.programmers1.test_01to20;

public class Test_11_HarshadNumber {
    public boolean solution(int x) {
        int sumX = 0;
        String strX = Integer.toString(x);
        for (int i = 0; i < strX.length(); i++) {
            sumX += Integer.parseInt(strX.substring(i, i + 1));
        }
        if (x % sumX == 0) {
            return true;
        } else {
            return false;
        }
    }
}
