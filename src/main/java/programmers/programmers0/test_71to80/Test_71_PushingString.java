package programmers.programmers0.test_71to80;

public class Test_71_PushingString {
    public int solution(String A, String B) {
        int answer = 0;

        String AA = A; // 임시 복사
        for (int i = 0; i < A.length(); i++) { // A를 회전
            if (AA.equals(B)) { // 회전하지 않더라도 같은 경우
                return answer; // 0을 반환
            }
            String AAA = AA.substring(AA.length() - 1); // 회전할 때 처음으로 돌아올 문자를 저장
            AA = AAA + AA.substring(0, AA.length() - 1); // AAA를 앞에서 붙임
            answer++; // 밀은 횟수 증가
        }

        return -1; // 같지 않을 경우 -1을 반환
    }

    public static void main(String[] args) {
        Test_71_PushingString sol = new Test_71_PushingString();
        String A = "hello"; String B = "ohell";
//        String A = "apple"; String B = "elppa";
//        String A = "atat"; String B = "tata";
//        String A = "abc"; String B = "abc";
        System.out.println(sol.solution(A, B));
    }
}
