package algorithm.programmers0.test_71to80;

public class Test_80_Parallel {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        int x4 = dots[3][0];
        int y4 = dots[3][1];

        double slope1 = (double) (y2 - y1) / (x2 - x1);
        double slope2 = (double) (y4 - y3) / (x4 - x3);
        double slope3 = (double) (y3 - y1) / (x3 - x1);
        double slope4 = (double) (y4 - y2) / (x4 - x2);
        double slope5 = (double) (y4 - y1) / (x4 - x1);
        double slope6 = (double) (y3 - y2) / (x3 - x2);

        if (slope1 == slope2 || slope3 == slope4 || slope5 == slope6) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_80_Parallel sol = new Test_80_Parallel();
        int[][] dots = {{1, 4}, {2, 9}, {2, 8}, {4, 18}};
//        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        System.out.println(sol.solution(dots));
    }
}
