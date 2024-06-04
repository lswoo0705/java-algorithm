package algorithm.programmers2.test_21to40;

public class Test_29_Fatigue {
    private int maxDungeons = 0; // 들어갈 수 있는 최대 던전 수

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length]; // 던전의 방문 여부
        explore(k, dungeons, visited, 0); // 재귀함수 호출

        return maxDungeons;
    }

    private void explore(int k, int[][] dungeons, boolean[] visited, int count) {
        // 모든 던전 반복
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) { // 던전 입장이 가능하고, 최소 피로도가 남은 경우
                visited[i] = true; // 방문으로 표시
                explore(k - dungeons[i][1], dungeons, visited, count + 1); // 남은 피로도를 계산해서 재귀함수 호출
                visited[i] = false; // 백트래킹을 위해 미방문 상태로 변경
            }
        }
        // 최대 던전 수 갱신
        maxDungeons = Math.max(maxDungeons, count);
    }
}
