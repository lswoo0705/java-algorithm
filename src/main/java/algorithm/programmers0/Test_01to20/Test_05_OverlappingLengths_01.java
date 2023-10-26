package algorithm.programmers0.Test_01to20;

import java.util.ArrayList;
import java.util.List;

public class Test_05_OverlappingLengths_01 {
    public int solution(int[][] lines) {
        int answer = 0;

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list11 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        for (int a = lines[0][0]; a < lines[0][1]+1; a++) {
            list1.add(a);
            list11.add(a);
        }
        for (int b = lines[1][0]; b < lines[1][1]+1; b++) {
            list2.add(b);

        }
        for (int c = lines[2][0]; c < lines[2][1]+1; c++) {
            list3.add(c);
        }

        list1.retainAll(list2);
        list2.retainAll(list3);
        list3.retainAll(list11);

        if (list1.size() != 0) {
            answer += list1.size() - 1;
        }
        if (list2.size() != 0) {
            answer += list2.size() - 1;
        }
        if (list3.size() != 0) {
            answer += list3.size() - 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_05_OverlappingLengths_01 sol = new Test_05_OverlappingLengths_01();
        int[][] input = {{0, 5}, {3, 9}, {1, 10}};

        System.out.println(sol.solution(input));
    }
}

// 겹치는 선을 점으로 생각하고