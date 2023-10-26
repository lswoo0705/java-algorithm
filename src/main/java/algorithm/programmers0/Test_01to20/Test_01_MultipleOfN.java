package algorithm.programmers0.Test_01to20;

// 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

import java.util.ArrayList;

public class Test_01_MultipleOfN {
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : numlist){
            if (num % n == 0){
                arrayList.add(num);
            }
        }
        return arrayList;
    }
}