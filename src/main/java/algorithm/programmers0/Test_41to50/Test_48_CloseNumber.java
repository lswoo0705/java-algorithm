package algorithm.programmers0.Test_41to50;

import java.util.Arrays;

public class Test_48_CloseNumber {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++){
            int interval = Math.abs(array[i] - n);
            if(min > interval){
                min = interval;
                answer = array[i];
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        Test_48_CloseNumber sol = new Test_48_CloseNumber();
        int[] array = {10, 16, 18};
        int n = 13;
        System.out.println(sol.solution(array, n));
    }
}
