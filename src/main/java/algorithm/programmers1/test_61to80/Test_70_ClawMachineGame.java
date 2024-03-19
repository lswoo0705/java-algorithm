package algorithm.programmers1.test_61to80;

import java.util.ArrayList;
import java.util.Stack;

public class Test_70_ClawMachineGame {
    public int solution(int[][] board, int[] moves) {
        // 사라진 인형의 개수를 리턴
//        int answer = 0;
//        ArrayList<Integer> basket = new ArrayList<>();

//        for (int i = 0; i < moves.length; i++) {
//            for (int j = -1; j >= -board.length; j--) {
//                if (board[moves[i]][j] == 0) {
//                    j--;
//                } else {
//                    board[moves[i]][j] = 0;
//                    basket.add(board[moves[i]][j]);
//                }
//                if (basket.get(-1) == basket.get(-2)) {
//                    basket.remove(-1);
//                    basket.remove(-2);
//                    answer += 2;
//                }
//            }
//        }

//        int answer = 0;
//        ArrayList<Integer> basket = new ArrayList<>();
//        for (int i = 0; i < moves.length; i++) {
//            int move = moves[i] - 1; // 배열 인덱스를 맞추기 위해 -1 해줌
//
//            for (int j = 0; j < board.length; j++) { // j는 0부터 시작하도록 수정
//                int doll = board[j][move];
//                if (doll != 0) {
//                    board[j][move] = 0;
//                    if (!basket.isEmpty() && basket.get(basket.size() - 1) == doll) { // 바구니가 비어있지 않고, 중복된 인형이 있는 경우
//                        basket.remove(basket.size() - 1); // 중복된 인형 두 개 제거
//                        answer += 2;
//                    } else {
//                        basket.add(doll);
//                    }
//                    break; // 한 번의 이동에 대해 바구니에 넣은 후에는 다음 이동으로 넘어감
//                }
//            }
//        }
//
//        return answer;

        // 추가 : 스텍 사용해서 해결해보기

        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) { // 해당 칸에 인형이 있다면
                    if (basket.isEmpty()) { // 바구니가 비어있다면
                        basket.push(board[i][move - 1]); // 해당 인형을 넣고
                        board[i][move - 1] = 0; // 기계에 인형을 지움
                        break;
                    }
                    if (board[i][move - 1] == basket.peek()) { // 해당 칸이 바구니 위에꺼와 같다면
                        basket.pop(); // 바구니 위에꺼를 지우고
                        answer += 2;
                    } else {
                        basket.push(board[i][move - 1]); // 바구니 위에 넣는다
                    }
                    board[i][move - 1] = 0; // 모든 경우를 해결하고 0으로 변경
                    break;
                }
            }
        }
        return answer;
    }
}
