package algorithm.programmers2.test_21to40;

public class Test_21_n2ArrayCut {
    public int[] solution(int n, long left, long right) {
//        int[] answer = new int[(int) (right - left + 1)];
//        int[] answerBeforeCut = new int[n * n];
//        int[][] nArray = new int[n][n];
//
//        // 1. 2차원 배열 만들기
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i > j) {
//                    nArray[i][j] = i + 1;
//                } else {
//                    nArray[i][j] = j + 1;
//                }
//            }
//        }
//
//        // 2. 2차원 배열을 1차원으로
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                answerBeforeCut[(i * n) + j] = nArray[i][j];
//            }
//        }
//
//        // 3. 배열을 left to right 자르기
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = answerBeforeCut[(int) (left + i)];
//        }
//
//        return answer;
        // 너무 정직한 코드라서
        // 시간복잡도, 공간복잡도에서 망함
        // 메모리 초과, 런타임 에러 등 45% 성공

        // answer 배열에 값을 바로 넣는 방법 필요


        int[] answer = new int[(int)(right - left + 1)];

        for (int i = 0; i < (int)(right - left + 1); i++) {
            // answer에 들어갈 인덱스
            long index = left + i;
            // 2차원 배열 행, 열의 값
            int row = (int)(index / n); // 행
            int col = (int)(index % n); // 열

            // 2차원 배열에서의 값을 바로 넣기
            if (row > col) {
                answer[i] = row + 1;
            } else {
                answer[i] = col + 1;
            }
        }

        return answer;
    }
}
