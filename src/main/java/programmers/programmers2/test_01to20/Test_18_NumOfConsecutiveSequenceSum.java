package programmers.programmers2.test_01to20;

import java.util.HashSet;

//public class Test_18_NumOfConsecutiveSequenceSum {
//    public int solution(int[] elements) {
//        int answer = 0;
//        // 회전 시킬 수 = 0 ~ elements.length
//        int rotationCount = 0;
//        int numOfElements = elements.length;
//        // 중복을 허용하지 않으므로 해쉬셋
//        HashSet<Integer> sums = new HashSet<>();
//
//        // while문으로 회전시킬 수가 elements.length가 동일해지기 전까지
//        while (rotationCount < numOfElements) {
//            // 배열 안에서 순서대로 합하여 해쉬셋에 추가
//            int sum = 0;
//            for (int i = 1; i < numOfElements; i++) { // 더할 요소의 개수를 증가
//                for (int j = 0; j < i; j++) { // 더할 요소의 개수들을 차례로 더하기
//                    sum += elements[j];
//                }
//                sums.add(sum);
//            }
//
//            // 배열을 회전시키기
//
//
//            // 배열의 회전시킨 후
//            rotationCount++;
//        }
//
//        answer = sums.size();
//
//        return answer;
//    }
//}


//public class Test_18_NumOfConsecutiveSequenceSum {
//    public int solution(int[] elements) {
//        int answer;
//        int numOfElements = elements.length;
//        HashSet<Integer> sums = new HashSet<>();
//
//        // 배열을 실제로 회전시키지 않고 각 회전을 시뮬레이션
//        for (int rotationCount = 0; rotationCount < numOfElements; rotationCount++) {
//            // 회전을 고려한 배열의 인덱스를 사용하여 모든 가능한 부분합 계산
//            for (int startIndex = 0; startIndex < numOfElements; startIndex++) { // 시작 인덱스
//                int sum = 0;
//                for (int lengthOfSum = 1; lengthOfSum <= numOfElements; lengthOfSum++) { // 부분 배열의 길이
//                    sum += elements[(startIndex + lengthOfSum - 1) % numOfElements]; // 원형 배열을 모방
//                    sums.add(sum);
//                }
//            }
//        }
//
//        answer = sums.size();
//
//        return answer;
//    }
//}
// 시간초과 : 20%
// 배열을 두배로 늘려서 배열을 회전시키는 로직을 무시할 수 있다.


public class Test_18_NumOfConsecutiveSequenceSum {
    public int solution(int[] elements) {
        int numOfElements = elements.length;
        HashSet<Integer> sums = new HashSet<>();
        int[] extendedElements = new int[numOfElements * 2];

        // 원본 배열을 두 배로 확장하여 원형 배열 시뮬레이션
        for (int i = 0; i < numOfElements * 2; i++) {
            extendedElements[i] = elements[i % numOfElements];
        }

        // 모든 가능한 부분합 계산
        for (int startIndex = 0; startIndex < numOfElements; startIndex++) {
            int sum = 0;
            for (int lengthOfSum = 1; lengthOfSum <= numOfElements; lengthOfSum++) {
                sum += extendedElements[startIndex + lengthOfSum - 1];
                sums.add(sum);
            }
        }

        return sums.size();
    }
}
