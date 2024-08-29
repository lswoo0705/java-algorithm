package programmers.programmers0.test_161to180;

import java.util.ArrayList;
import java.util.List;

// 리스트 자르기
public class Test_177_CuttingList {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> result = new ArrayList<>();

        switch (n) {
            case 1 -> {
                for (int i = 0; i <= slicer[1]; i++) {
                    result.add(num_list[i]);
                }
            }
            case 2 -> {
                for (int i = slicer[0]; i < num_list.length; i++) {
                    result.add(num_list[i]);
                }
            }
            case 3 -> {
                for (int i = slicer[0]; i <= slicer[1]; i++) {
                    result.add(num_list[i]);
                }
            }
            case 4 -> {
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    result.add(num_list[i]);
                }
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
