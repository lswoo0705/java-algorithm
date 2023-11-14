package algorithm.programmers1.test_21to40;

public class Test_38_ClosestOfTheSameLetter {
    public int[] solution(String s) {
//        int[] answer = new int[s.length()];
//        answer[0] = -1;
//        String[] sArr = s.split("");
//        for (int i = 1; i < sArr.length; i++) {
//            String checkStr = sArr[i];
//            for (int j = 0; j < i; j++) {
//                if (checkStr.equals(sArr[j])) {
//                    answer[i] = i - j;
//                } else {
//                    answer[i] = -1; // 여기서 else문 때문에 앞에 같은 글자가 있더라도 -1로 다시 바뀌는 경우가 있음
//                }
//            }
//        }
//        return answer;


//        int[] answer = new int[s.length()];
//
//        String[] sArr = s.split("");
//
//        for (int i = 0; i < sArr.length; i++) {
//            answer[i] = -1; // if else를 사용하지 않고, 확인하는 알파벳이 처음이면 -1을 반환하기 위해 전부 -1로 시작
//            String checkStr = sArr[i]; // 다시보니 필요없는 변수
//            for (int j = 0; j < i; j++) {
//                if (checkStr.equals(sArr[j])) {
//                    answer[i] = i - j;
//                }
//            }
//        }


        // else문을 사용하지 않아 아무 값이 없는 인덱스를 -1로 바꾸는 과정 -> 굳이 따로 빼지않고 위에 for문에서 바꿔놓고 시작
//        for (int i = 0; i < answer.length; i++) {
//            if (answer[i] == 0) {
//                answer[i] = -1;
//            }
//        }


        int[] answer = new int[s.length()];

        String[] sArr = s.split("");

        for (int i = 0; i < sArr.length; i++) {
            answer[i] = -1; // if else를 사용하지 않고, 확인하는 알파벳이 처음이면 -1을 반환하기 위해 전부 -1로 시작
            for (int j = 0; j < i; j++) {
                if (sArr[i].equals(sArr[j])) {
                    answer[i] = i - j;
                }
            }
        }

        return answer;
    }
}
