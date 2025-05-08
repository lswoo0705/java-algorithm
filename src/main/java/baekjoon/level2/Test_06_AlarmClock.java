package baekjoon.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_06_AlarmClock {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = stoi(st.nextToken());
        int minute = stoi(st.nextToken());

        minute -= 45;
        if (minute < 0) {
            minute += 60;
            hour--;
            if (hour < 0) {
                hour = 23;
            }
        }

        System.out.println(hour + " " + minute);
    }
}
