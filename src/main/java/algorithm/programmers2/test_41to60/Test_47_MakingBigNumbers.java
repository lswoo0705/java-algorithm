package algorithm.programmers2.test_41to60;

public class Test_47_MakingBigNumbers {
    public String solution(String number, int k) {
        // 탐욕법 사용
        StringBuilder sb = new StringBuilder();

        // 제거해야 할 수
        int removeCount = k;

        for (int i = 0; i < number.length(); i++) {
            char current = number.charAt(i);

            // 현재 문자보다 작거나 같은 문자를 제거하고, 제거 횟수가 남아 있을 경우
            while (removeCount > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) < current) {
                // 마지막 문자를 제거
                sb.deleteCharAt(sb.length() - 1);
                // 제거 횟수 감소
                removeCount--;
            }

            // 현재 문자를 추가
            sb.append(current);
        }

        // 제거해야 할 숫자가 남아 있다면 뒤에서 제거
        // sb.length()는 항상 number.length() - k 보다 큼.
        while (removeCount > 0) {
            sb.deleteCharAt(sb.length() - 1);
            removeCount--;
        }

        return sb.toString();
    }
}
