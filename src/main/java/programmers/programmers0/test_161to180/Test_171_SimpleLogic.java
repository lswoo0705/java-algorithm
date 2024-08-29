package programmers.programmers0.test_161to180;

public class Test_171_SimpleLogic {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        // 양쪽 다 T일 때 T
        // 1, 2 둘 다 F일 때만 F
        return (x1 || x2) && (x3 || x4);
    }
}
