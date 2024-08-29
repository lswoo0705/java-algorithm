package programmers.programmers2.test_21to40;

import java.util.Arrays;

public class Test_23_DiscountEvent {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        for (int day = 0; day < discount.length - 9; day++) {
            boolean allMatch = true; // 현재 날짜부터 10일 동안의 할인 상품 중에서 정현이가 원하는 상품의 수량을 모두 충족할 수 있는지 여부
            int[] copyOfNumber = Arrays.copyOf(number, number.length); // number 배열의 복사본 생성

            // 현재 날짜부터 10일 동안의 할인 상품 확인
            for (int i = day; i < day + 10; i++) {
                // 현재 할인 상품이 정현이가 원하는 상품 중 하나인지 확인
                boolean found = false;
                for (int j = 0; j < want.length; j++) {
                    if (discount[i].equals(want[j]) && copyOfNumber[j] > 0) {
                        found = true;
                        copyOfNumber[j]--; // 복사본 상품 수량 감소
                        break;
                    }
                }

                // 현재 할인 상품이 정현이가 원하는 상품 중 하나가 아닌 경우
                if (!found) {
                    allMatch = false;
                    break;
                }
            }

            // number 배열의 모든 요소가 0이 아닌 경우 allMatch를 false로 변경
            if (Arrays.stream(copyOfNumber).anyMatch(num -> num != 0)) {
                allMatch = false;
            }

            // 현재 날짜부터 10일 동안의 할인 상품 중에서 정현이가 원하는 상품의 수량을 모두 충족할 수 있는 경우
            if (allMatch) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_23_DiscountEvent sol = new Test_23_DiscountEvent();
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(sol.solution(want, number, discount));
    }
}
