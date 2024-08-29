package programmers.programmers0.test_01to20;

import java.util.ArrayList;

public class Test_17_HateEvenNum {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i += 2) {
            arrayList.add(i);
        }
        return arrayList;
    }
}
