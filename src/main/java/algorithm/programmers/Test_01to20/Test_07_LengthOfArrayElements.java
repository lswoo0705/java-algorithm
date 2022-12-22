package algorithm.programmers.Test_01to20;

public class Test_07_LengthOfArrayElements {
    public int[] solution(String[] strlist) {
        int[] wordLength= new int[strlist.length];
        int word = strlist.length;
        for (int i = 0; i < word; i++) {
            wordLength[i] = strlist[i].length();
        }
        return wordLength;
    }

    public static void main(String[] args) {
        Test_07_LengthOfArrayElements sol = new Test_07_LengthOfArrayElements();
        String[] input = {"We", "are", "the", "world!"};

        System.out.println(sol.solution(input));
    }
}
