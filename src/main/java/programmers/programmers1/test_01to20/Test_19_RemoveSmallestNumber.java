package programmers.programmers1.test_01to20;

public class Test_19_RemoveSmallestNumber {
    public int[] solution(int[] arr) {
        // 매개변수 배열의 길이가 1이라면 -1을 반환
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 배열의 최소값을 0번째 인덱스로 기준잡기
        int minNum = arr[0];
        int minIndex = 0;
        // 나머지 배열의 요소들을 비교하여 최소값 찾기
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
                minIndex = i;
            }
        }

        // arr보다 인덱스의 길이가 1짧은 배열 선언
        int[] answer = new int[arr.length - 1];
        int answerIndex = 0;
        // arr배열을 돌려 최소값만 제외하고 answer배열에 담기
        for (int i = 0; i < arr.length; i++) {
            if (i != minIndex) {
                answer[answerIndex] = arr[i];
                answerIndex++;
            }
        }

        return answer;
    }
}
