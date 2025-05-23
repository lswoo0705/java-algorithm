package baekjoon.level8;

//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Test_07_SnailWantToGoUp {
//    static int toInt(String s) {
//        return Integer.parseInt(s);
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int up = toInt(st.nextToken());
//        int down = toInt(st.nextToken());
//        int target = toInt(st.nextToken());
//        int high = 0;
//        int day = 0;
//
//        while (high < target) {
//            day++;
//            high += up;
//            if (high >= target) {
//                break;
//            }
//            high -= down;
//        }
//
//        System.out.println(day);
//    }
//}

// ----------- 시간 초과 -----------

// 하루에 A - B 만큼 올라감
// 하지만 A 올라간 시점에서 정상에 도달했다면 B는 감소하지 않음
// (V - A) / (A - B) + 1
// 정상에 도착하기 하루 전날을 하루에 올라갈 수 있는 높이로 나눈 뒤 + 1
// 이 값을 반올림해야하므로 ceil 변환하면
// (V - B - 1) / (A - B) + 1

import java.io.*;
import java.util.StringTokenizer;

public class Test_07_SnailWantToGoUp {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int up = toInt(st.nextToken());
        int down = toInt(st.nextToken());
        int target = toInt(st.nextToken());

        int day = (target - down - 1) / (up - down) + 1;

        System.out.println(day);
    }
}
