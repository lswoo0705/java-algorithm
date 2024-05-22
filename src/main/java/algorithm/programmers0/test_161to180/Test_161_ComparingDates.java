package algorithm.programmers0.test_161to180;

import java.time.LocalDate;

public class Test_161_ComparingDates {
    public int solution(int[] date1, int[] date2) {
//        if (date1[0] < date2[0]) {
//            return 1;
//        } else if (date1[0] == date2[0] && date1[1] < date2[1]) {
//            return 1;
//        } else if (date1[0] == date2[0] && date1[1] == date2[1] && date1[2] < date2[2]) {
//            return 1;
//        } else
//            return 0;

        // LocalDate 사용
        LocalDate localDate1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate localDate2 = LocalDate.of(date2[0], date2[1], date2[2]);

        if (localDate1.isBefore(localDate2)) {
            return 1;
        } else {
            return 0;
        }
    }
}
