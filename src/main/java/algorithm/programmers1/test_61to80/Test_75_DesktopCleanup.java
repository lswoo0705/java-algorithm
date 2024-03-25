package algorithm.programmers1.test_61to80;

public class Test_75_DesktopCleanup {
    public int[] solution(String[] wallpaper) {
        int[] answer = {50, 50, 0, 0};

        // s y
        for (int i = 0; i < wallpaper.length; i++) { // 세로
            if (wallpaper[i].contains("#")) {
                answer[0] = i;
                break;
            }
        }

        // s x
        for (String s : wallpaper) {
            if (s.contains("#")) {
                if (answer[1] > s.indexOf('#')) {
                    answer[1] = s.indexOf('#');
                }
            }
        }

        // e y
        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                answer[2] = i + 1;
            }
        }

        // e x
        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                if (answer[3] < wallpaper[i].lastIndexOf('#')) {
                    answer[3] = wallpaper[i].lastIndexOf('#');
                }
            }
        }

        answer[3] += 1;

        return answer;
    }
}
