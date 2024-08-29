package programmers.programmers0.test_01to20;

public class Test_08_LocationOfPoint {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        int location = 0;
        if (x > 0 && y > 0) {
            location = 1;
        } else if (x < 0 && y > 0) {
            location = 2;
        } else if (x < 0 && y < 0) {
            location = 3;
        } else if (x > 0 && y < 0) {
            location = 4;
        }
        return location;
    }
}
