package programmers.programmers0.test_161to180;

import java.util.ArrayList;

public class Test_169_IncreasingLengthOfArr {
    public int[] solution(int[] arr) {
        // int result = 2 << 3; // (2 * 2 * 2 * 2 = 16)

//        int arrLength = arr.length;
//        int maxLength = 0;
//        int num = 0;
//
//        while (maxLength < arrLength) {
//            if (arrLength <= (2 << num)) {
//                maxLength = 2 << num;
//            } else {
//                num++;
//            }
//        }
//
//        int[] answer = new int[maxLength];
//
//        for (int i = 0; i < arrLength; i++) {
//            answer[i] = arr[i];
//        }
//
//        for (int i = arrLength; i < maxLength; i++) {
//            answer[i] = 0;
//        }
//
//        return answer;

        // --------------------

        int arrLength = arr.length;
        int maxLength = 1;

        // 배열 길이가 2의 배수가 되도록
        while (maxLength < arrLength) {
            maxLength <<= 1;
        }

        ArrayList<Integer> list = new ArrayList<>();

        // arr를 ArrayList에 복사
        for (int j : arr) {
            list.add(j);
        }

        // maxLength까지 나머지를 0으로 채움
        while (list.size() < maxLength) {
            list.add(0);
        }

        // int 배열로 변환
        int[] answer = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
