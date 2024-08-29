package programmers.programmers2.test_21to40;

import java.util.Stack;

// 택배상자
public class Test_40_DeliveryBox {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int box = 1; // 컨테이너 벨트에서 확인하는 상자 번호
        int index = 0; // order에서 필요한 상자 번호의 인덱스

        while (index < order.length) {
            if (box == order[index]) { // 컨테이너벨트에서 트럭에 실을 수 있는 경우
                answer++;
                index++;
                box++;
            } else if (!stack.isEmpty() && stack.peek() == order[index]) { // 보조 컨테이너 벨트에서 트럭에 실을 수 있는 경우
                stack.pop();
                answer++;
                index++;
            } else if (box <= order.length) { // 컨테이너 벨트에서 상자를 보조 컨테이너 벨트로 이동
                stack.push(box);
                box++;
            } else { // 더 이상 트럭에 실을 수 없는 경우
                break;
            }
        }

        return answer;
    }
}
