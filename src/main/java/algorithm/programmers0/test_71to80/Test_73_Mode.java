package algorithm.programmers0.test_71to80;

import java.util.Arrays;

public class Test_73_Mode {
    public int solution(int[] array) {
        Arrays.sort(array);

        int answer = 0;
        int maxNum = array[array.length - 1];
        int[] newArray = new int[maxNum + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[array[i]]++;
        }
        maxNum = newArray[0];

        for (int i = 1; i < newArray.length; i++) {
            if (maxNum < newArray[i]) {
                maxNum = newArray[i];
                answer = i;
            } else if (maxNum == newArray[i]) {
                answer = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_73_Mode sol = new Test_73_Mode();
//        int[] array = {1, 2, 3, 3, 3, 4};
//        int[] array = {1, 1, 2, 2};
        int[] array = {1, 2};
        System.out.println(sol.solution(array));
    }
}
