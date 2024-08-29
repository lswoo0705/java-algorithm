package programmers.programmers1.test_21to40;

public class Test_33_SmallPartString {
    public int solution(String t, String p) {
        int answer = 0;
        // 정수의 비교 시 t의 길이가 최대 10000이므로 int가 아닌 Iong으로 바꿔주어야 런타임에러가 생기지 않는다.
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            if (Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_33_SmallPartString sol = new Test_33_SmallPartString();
//        String t = "3141592"; String p = "271";
        String t = "500220839878"; String p = "7";
        System.out.println(sol.solution(t, p));
    }
}
