package baekjoon.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_07_OvenClock {
    static int N;

    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = stoi(st.nextToken());
        int minute = stoi(st.nextToken());
        int cooking = stoi(br.readLine());

//        minute += cooking;
//        if (minute >= 60) {
//            hour += minute / 60;
//            minute = minute % 60;
//            if (hour >= 24) {
//                hour -= 24;
//            }
//        }

        minute += cooking;
        hour += minute / 60;
        minute %= 60;
        hour %= 24;

        System.out.println(hour + " " + minute);
    }
}
