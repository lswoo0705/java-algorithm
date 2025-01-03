package programmers.programmers0.test_181to200;

import java.time.LocalDate;
import java.util.Scanner;

public class Test_200_AgeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;
        LocalDate now = LocalDate.now();

//        if (age_type.equals("Korea")) {
//            answer = 2030 - year + 1;
//        } else if (age_type.equals("Year")) {
//            answer = 2030 - year;
//        }

        if (age_type.equals("Korea")) {
            answer = now.getYear() - year + 1;
        } else if (age_type.equals("Year")) {
            answer = now.getYear() - year;
        }

        System.out.println(answer);
    }
}
