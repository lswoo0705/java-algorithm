package algorithm.programmers1.test_61to80;

public class Test_75_DesktopCleanup {
    public int[] solution(String[] wallpaper) {
        int[] answer = {50, 50, 0, 0};

//        // s y
//        for (int i = 0; i < wallpaper.length; i++) { // 세로
//            if (wallpaper[i].contains("#")) {
//                answer[0] = i;
//                break;
//            }
//        }
//
//        // s x
//        for (String s : wallpaper) {
//            if (s.contains("#")) {
//                if (answer[1] > s.indexOf('#')) {
//                    answer[1] = s.indexOf('#');
//                }
//            }
//        }
//
//        // e y
//        for (int i = 0; i < wallpaper.length; i++) {
//            if (wallpaper[i].contains("#")) {
//                answer[2] = i + 1;
//            }
//        }
//
//        // e x
//        for (int i = 0; i < wallpaper.length; i++) {
//            if (wallpaper[i].contains("#")) {
//                if (answer[3] < wallpaper[i].lastIndexOf('#')) {
//                    answer[3] = wallpaper[i].lastIndexOf('#');
//                }
//            }
//        }
//
//        answer[3] += 1;

        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                // s y
                answer[0] = Math.min(answer[0], i);

                // s x
                answer[1] = Math.min(answer[1], wallpaper[i].indexOf('#'));

                // e y
                answer[2] = Math.max(answer[2], i);

                // e x
                answer[3] = Math.max(answer[3], wallpaper[i].lastIndexOf('#'));
            }
        }

        answer[2]++;
        answer[3]++;

        return answer;
    }
}
