package programmers.programmers0.test_201to220;

import java.util.Arrays;

public class Test_214_SculptingArr {
    public int[] solution(int[] arr, int[] query) {
//        List<Integer> arrList = new ArrayList<>();
//
//        for (int j : arr) {
//            arrList.add(j);
//        }
//
//        for (int i = 0; i < query.length; i++) {
//            if (i % 2 == 0) {
//                arrList = new ArrayList<>(arrList.subList(0, query[i] + 1));
//            } else {
//                arrList = new ArrayList<>(arrList.subList(query[i], arrList.size()));
//            }
//        }
//
//        int[] answer = arrList.stream().mapToInt(Integer::intValue).toArray();
//
//        return answer;

        // 리스트 변환 불필요, 배열을 복사하는 방법 사용

        int start = 0;
        int end = arr.length;

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i] + 1;
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end);
    }
}
