package programmers.programmers0.test_121to140;

public class Test_135_ManipulatingNumbers1 {
    public int solution(int n, String control) {
        int answer = n;

        for (int i = 0; i < control.length(); i++) {
            switch (control.charAt(i)) {
                case 'w' -> answer += 1;
                case 's' -> answer -= 1;
                case 'd' -> answer += 10;
                case 'a' -> answer -= 10;
            }
        }

        return answer;
    }
}
