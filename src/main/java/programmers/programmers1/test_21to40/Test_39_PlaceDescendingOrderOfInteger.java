package programmers.programmers1.test_21to40;

import java.util.Arrays;

public class Test_39_PlaceDescendingOrderOfInteger {
    public long solution(long n) {
//        long answer = 0;
//        // 정렬을 위해 변환
//        String longToStr = Long.toString(n);
//        Character[] strToCharArr = new Character[longToStr.length()];
//        for (int i = 0; i < longToStr.length(); i++) {
//            strToCharArr[i] = longToStr.charAt(i);
//        }
//        /* 람다식 표현 가능
//        Arrays.sort(strToCharArr, new Comparator<Character>() {
//            @Override
//            public int compare(Character o1, Character o2) {
//                return o2 - o1; // o1 - o2 : 정순
//            }
//        });
//        */
//        // 배열을 오름차순의 역순으로 정렬 -> 내림차순
//        Arrays.sort(strToCharArr, (o1, o2) -> o2 - o1);
//        // StringBuilder로 String으로 변환, 반환타입 long으로 변환
//        StringBuilder stringBuilder = new StringBuilder();
//        for (Character i : strToCharArr) {
//            stringBuilder.append(i);
//        }
//        String answerStr = stringBuilder.toString();
//        answer = Long.parseLong(answerStr);
//
//        return answer;

        // StringBuilder의 .reverse 사용하기
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }
}
