package programmers.programmers1.test_61to80;

import java.util.Arrays;

public class Test_78_walkInThePark {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        // 출발지점 찾기
        int yLocation = 0;
        int xLocation = 0;
        boolean found = false;
        for (int i = 0; i < park.length && !found; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    yLocation = i;
                    xLocation = j;
                    found = true;
                    break;
                }
            }
        }

        // 명령어 수행
        for (String route : routes) {
            char direction = route.charAt(0);
            int numOfStep = Integer.parseInt(route.substring(2)); // 이동할 거리

            switch (direction) {
                case 'N' -> yLocation = goN(park, numOfStep, yLocation, xLocation);
                case 'S' -> yLocation = goS(park, numOfStep, yLocation, xLocation);
                case 'W' -> xLocation = goW(park, numOfStep, yLocation, xLocation);
                case 'E' -> xLocation = goE(park, numOfStep, yLocation, xLocation);
            }
        }

        answer[0] = yLocation;
        answer[1] = xLocation;

        return answer;
    }

    // 북쪽으로 이동
    private int goN(String[] park, int numOfStep, int yLocation, int xLocation) {
        int startPoint = yLocation;
        for (int i = 1; i <= numOfStep; i++) {
            if (startPoint - i >= 0 && (park[startPoint - i].charAt(xLocation) == 'O'
                    || park[startPoint - i].charAt(xLocation) == 'S')) {
                yLocation--;
            } else {
                return startPoint;
            }
        }
        return yLocation;
    }

    // 남쪽으로 이동
    private int goS(String[] park, int numOfStep, int yLocation, int xLocation) {
        int startPoint = yLocation;
        for (int i = 1; i <= numOfStep; i++) {
            if (startPoint + i < park.length && (park[startPoint + i].charAt(xLocation) == 'O'
                    || park[startPoint + i].charAt(xLocation) == 'S')) {
                yLocation++;
            } else {
                return startPoint;
            }
        }
        return yLocation;
    }

    // 서쪽으로 이동
    private int goW(String[] park, int numOfStep, int yLocation, int xLocation) {
        int startPoint = xLocation;
        for (int i = 1; i <= numOfStep; i++) {
            if (startPoint - i >= 0 && (park[yLocation].charAt(startPoint - i) == 'O'
                    || park[yLocation].charAt(startPoint - i) == 'S')) {
                xLocation--;
            } else {
                return startPoint;
            }
        }
        return xLocation;
    }

    // 동쪽으로 이동
    private int goE(String[] park, int numOfStep, int yLocation, int xLocation) {
        int startPoint = xLocation;
        for (int i = 1; i <= numOfStep; i++) {
            if (startPoint + i < park[0].length() && (park[yLocation].charAt(startPoint + i) == 'O'
                    || park[yLocation].charAt(startPoint + i) == 'S')) {
                xLocation++;
            } else {
                return startPoint;
            }
        }
        return xLocation;
    }

    public static void main(String[] args) {
        Test_78_walkInThePark sol = new Test_78_walkInThePark();
        // 예시 1
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"}; // 결과값 : [2, 1]
        // 예시 2
//        String[] park = {"SOO","OXX","OOO"};
//        String[] routes = {"E 2","S 2","W 1"}; // 결과값 : [0, 1]
        // 예시 3
//        String[] park = {"OSO", "OOO", "OXO", "OOO"};
//        String[] routes = {"E 2", "S 3", "W 1"}; // 결과값 : [0, 0]
        System.out.println(Arrays.toString(sol.solution(park, routes)));
    }
}
