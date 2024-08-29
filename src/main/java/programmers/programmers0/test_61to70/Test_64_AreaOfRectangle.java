package programmers.programmers0.test_61to70;

public class Test_64_AreaOfRectangle {
    public int solution(int[][] dots) {
        int minX = dots[0][0];
        int maxX = dots[0][0];
        int minY = dots[0][1];
        int maxY = dots[0][1];

        for (int i = 1; i < dots.length; i++) {
            minX = Math.min(minX, dots[i][0]);
            maxX = Math.max(maxX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
            maxY = Math.max(maxY, dots[i][1]);
        }

        int lengthOfX = maxX - minX;
        int lengthOfY = maxY - minY;

        int answer = lengthOfX * lengthOfY;

        return answer;
    }

    public static void main(String[] args) {
        Test_64_AreaOfRectangle sol = new Test_64_AreaOfRectangle();
//        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        System.out.println(sol.solution(dots));
    }
}
