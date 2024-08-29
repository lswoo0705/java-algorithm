package programmers.programmers1.test_21to40;

import java.util.ArrayList;

public class Test_30_HateSameNum {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answerArr = new ArrayList<>();
        // 매개변수 배열을 돌아가며 바로 뒤의 숫자와 같지 않다면 리스트에 넣기
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                answerArr.add(arr[i]);
            }
        }
        // 배열의 맨 뒤에 숫자는 항상 같거나 추가되지 않기 때문에 따로 넣어주기
        answerArr.add(arr[arr.length - 1]);

        int[] answer = new int[answerArr.size()];
        
        for (int i = 0; i < answerArr.size(); i++) {
            answer[i] = answerArr.get(i);
        }

        return answer;
    }
}
