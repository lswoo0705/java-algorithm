package algorithm.programmers0.Test_31to40;

public class Test_39_AgeOfPlanet {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();

        while (age > 0) {
            int remainder = age % 10;
            char ch = (char) (remainder + 'a');
            answer.insert(0, ch);
            age /= 10;
        }

        return answer.toString();
    }


    public static void main(String[] args) {
        Test_39_AgeOfPlanet sol = new Test_39_AgeOfPlanet();
        int age = 23;
        System.out.println(sol.solution(age));
    }
}
