package algorithm.programmers1.test_21to40;

public class Test_26_StringHandlingBasics {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        } else if (s.matches("[0-9]+")) {
            return true;
        } else {
            return false;
        }
    }
}
