package algorithm.programmers1.test_41to60;

import java.util.Arrays;

public class Test_57_OverPainting {
    public int solution(int n, int m, int[] section) {
        int count = 0;

        int[] allSection = new int[n];
        Arrays.fill(allSection, 1);

        for (int i = 0; i < section.length; i++) {
            allSection[section[i] - 1] = 0;
        }

        for (int i = 0; i < n; i++) {
            if (allSection[i] == 0) {
                for (int j = 0; j < m && i + j < n; j++) {
                    allSection[i + j] = 1;
                }
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Test_57_OverPainting sol = new Test_57_OverPainting();
        int n = 8; int m = 4; int[] section = {2, 3, 6};
        System.out.println(sol.solution(n, m, section));

    }
}
