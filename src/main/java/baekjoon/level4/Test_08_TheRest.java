package baekjoon.level4;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Test_08_TheRest {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int num = toInt(br.readLine());
            int remain = num % 42;
            set.add(remain);
        }

        System.out.println(set.size());
    }
}
