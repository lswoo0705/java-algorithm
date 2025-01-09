package programmers.programmers0.test_201to220;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test_203_NationalCompetitionExamination {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> attendanceStudents = new ArrayList<>();

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                attendanceStudents.add(i);
            }
        }

        attendanceStudents.sort(Comparator.comparingInt(i -> rank[i]));

        int a = attendanceStudents.get(0);
        int b = attendanceStudents.get(1);
        int c = attendanceStudents.get(2);

        return 10000 * a + 100 * b + c;
    }
}
