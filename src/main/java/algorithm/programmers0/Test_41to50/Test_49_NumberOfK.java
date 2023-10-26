package algorithm.programmers0.Test_41to50;

// 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
// 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
public class Test_49_NumberOfK {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String stringK = String.valueOf(k); // k를 문자열로
        for (int l = i; l < j + 1; l++) { // i부터 j까지
            String targetNum = String.valueOf(l); // 증가되는 타겟 숫자를 매번 문자열로
            if (targetNum.contains(stringK)) { // 문자열로 바꾼 k가 타겟 숫자에 포함돼있다면
                String[] targetArray = targetNum.split(""); // 타겟 숫자를 끊어서 배열로 바꾸고
                for (String num : targetArray) { // 배열을 돌려서
                    if (num.equals(stringK)) { // 문자열 k와 일치한다면
                        answer++; // 카운트
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_49_NumberOfK sol = new Test_49_NumberOfK();
        int i = 1;
        int j = 13;
        int k = 1;
        System.out.println(sol.solution(i, j, k));
    }
}
