package algorithm.programmers;

import java.util.ArrayList;

public class Test_06_DoubleArray {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : numbers) {
            arrayList.add(num * 2);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        Test_06_DoubleArray sol = new Test_06_DoubleArray();
        int[] input = {1, 2, 100, -99, 1, 2, 3};

        System.out.println(sol.solution(input));
    }
}
