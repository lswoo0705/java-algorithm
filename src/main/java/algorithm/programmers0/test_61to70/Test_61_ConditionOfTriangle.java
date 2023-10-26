package algorithm.programmers0.test_61to70;

public class Test_61_ConditionOfTriangle {
    public int solution(int[] sides) {
        int addOfSides = sides[0] + sides[1];
        int subOfSides = Math.abs(sides[0] - sides[1]);

        int answer = addOfSides - subOfSides - 1;

        return answer;
    }

    public static void main(String[] args) {
        Test_61_ConditionOfTriangle sol = new Test_61_ConditionOfTriangle();
        int[] sides = {3, 6};
        System.out.println(sol.solution(sides));
    }
}
