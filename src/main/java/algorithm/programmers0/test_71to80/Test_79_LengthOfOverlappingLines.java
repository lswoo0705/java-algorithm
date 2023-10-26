package algorithm.programmers0.test_71to80;

public class Test_79_LengthOfOverlappingLines {
    public int solution(int[][] lines) {
        int answer = 0;
        // 좌표에 일치시키기 위한 새로운 배열 생성
        int[] arr = new int[200];

        // 0부터 200까지의 인덱스를 좌표로 치환하여 모든 선분의 좌표를 arr 인덱스에 추가
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) { // 음수인 인덱스가 있을 수 없으므로 100을 더해준다
                arr[j]++;
            }
        }

        // 선분이 겹쳐서 2개가 카운트된 배열의 총 개수를 반환
        for (int i = 0; i < 200; i++) {
            if (arr[i] > 1) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_79_LengthOfOverlappingLines sol = new Test_79_LengthOfOverlappingLines();
//        int[][] lines = {{0, 2}, {-3, -1}, {-2, 1}};
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        System.out.println(sol.solution(lines));
    }
}
