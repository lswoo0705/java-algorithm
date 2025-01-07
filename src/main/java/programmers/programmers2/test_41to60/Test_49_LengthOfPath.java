package programmers.programmers2.test_41to60;

import java.util.HashSet;
import java.util.Set;

public class Test_49_LengthOfPath {
    public int solution(String dirs) {
        int x = 0;
        int y = 0;
        Set<String> path = new HashSet<>();
        char[] dirChar = {'U', 'D', 'R', 'L'};
        int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        for (char dir : dirs.toCharArray()) {
            // dir에서 이동경로를 하나씩 가져옴
            int dirIndex = new String(dirChar).indexOf(dir);
            int dirX = x + direction[dirIndex][0];
            int dirY = y + direction[dirIndex][1];

            // 경계 확인
            if (dirX < -5 || dirX > 5 || dirY < -5 || dirY > 5) {
                continue;
            }

            // 경로를 문자열로 양방향 저장
            String path1 = x + "," + y + "->" + dirX + "," + dirY;
            String path2 = dirX + "," + dirY + "->" + x + "," + y;

            // 새로운 경로라면 Set에 추가
            if (!path.contains(path1)) {
                path.add(path1);
                path.add(path2);
            }

            // 좌표를 갱신
            x = dirX;
            y = dirY;
        }

        // Set에 양방향으로 저장되어있으므로 2로 나눈다
        return path.size() / 2;
    }
}
