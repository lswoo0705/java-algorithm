package algorithm.programmers2.test_01to20;

public class Test_07_NextBigNumber {
    public int solution(int n) {
//        int answer;
//        int count = 1;
//        long countN = countOne(n);
//
//        while (true) {
//            int m = n + count;
//            if (countN == countOne(m)) {
//                answer = m;
//                break;
//            }
//            count++;
//        }
//
//        return answer;
//    }
//
//    private long countOne(int n) {
//        String binaryN = Integer.toBinaryString(n);
//        return binaryN.chars()
//                .filter(c -> c == '1')
//                .count();
        // 정확성 테스트 - 성공
        // 효율성 테스트 - 실패(시간초과)


        int countN = Integer.bitCount(n); // 이진수에서 1의 개수를 찾는 함수

        for (int m = n + 1; ; m++) {
            if (Integer.bitCount(m) == countN) {
                return m;
            }
        }
    }
}
