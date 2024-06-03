package algorithm.programmers2.test_21to40;

import java.util.*;

public class Test_27_Tuple {
    public int[] solution(String s) {
        int[][] arr = stringTo2DArr(s);

        List<Integer> answerList = findElements(arr);

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    // 문자열 s를 2차원 배열로
    private int[][] stringTo2DArr(String s) {
        s = s.substring(2, s.length() - 2);
        String[] arrString = s.split("\\},\\{");

        int[][] arr = new int[arrString.length][];

        for (int i = 0; i < arrString.length; i++) {
            String[] numString = arrString[i].split(",");
            arr[i] = new int[numString.length];

            for (int j = 0; j < numString.length; j++) {
                arr[i][j] = Integer.parseInt(numString[j].trim());
            }
        }

        return arr;
    }

    // 각 원소에서 처음 등장하는 순서대로 리스트로 반환
    private List<Integer> findElements(int[][] arr) {
        // 배열을 리스트로 변환 후 길이에 따라서 오름차순 정렬
        List<int[]> list = new ArrayList<>(Arrays.asList(arr));
        list.sort(Comparator.comparingInt(a -> a.length));

        // 중복 요소를 제거하기 위해 HashSet 사용
        HashSet<Integer> newElement = new HashSet<>();
        List<Integer> answerList = new ArrayList<>();

        for (int[] subArr : list) {
            for (int num : subArr) {
                if (newElement.add(num)) {
                    answerList.add(num);
                }
            }
        }

        return answerList;
    }
}
