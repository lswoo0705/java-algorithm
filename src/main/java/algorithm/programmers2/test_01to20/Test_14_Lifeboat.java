package algorithm.programmers2.test_01to20;

import java.util.*;

public class Test_14_Lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int index = 0;

        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                index++;
            }
            answer++;
        }

        return answer;
    }
}
