package algorithm.programmers.Test_31to40;

public class Test_32_NumOfDice {

//    public int solution(int[] box, int n) {
//        int answer = 0;
//        int widthNum = 0;
//        int lengthNum = 0;
//        int heightNum = 0;
//
//        for (int i = 1; i * n <= box[0]; i++) {
//            widthNum++;
//        }
//
//        for (int i = 1; i * n <= box[1]; i++) {
//            lengthNum++;
//        }
//
//        for (int i = 1; i * n <= box[2]; i++) {
//            heightNum++;
//        }
//
//        answer = widthNum * lengthNum * heightNum;
//        return answer;
//    }

    public int solution(int[] box, int n) {
        int answer = 0;
        int widthNum = box[0] / n;
        int lengthNum = box[1] / n;
        int heightNum = box[2] / n;

        answer = widthNum * lengthNum * heightNum;
        return answer;
    }
}
