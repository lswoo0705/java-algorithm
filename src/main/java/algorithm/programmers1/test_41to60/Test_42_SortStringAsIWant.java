package algorithm.programmers1.test_41to60;

import java.util.Arrays;

public class Test_42_SortStringAsIWant {
    public String[] solution(String[] strings, int n) {
//        String[] answer = new String[strings.length];
//        Character[] refAlph = new Character[strings.length];
//
//        // 원래의 인덱스를 저장하는 배열 생성
//        Integer[] indices = new Integer[strings.length];
//        for (int i = 0; i < strings.length; i++) {
//            refAlph[i] = strings[i].charAt(n);
//            indices[i] = i;
//        }
//
//        // n번째 문자와 원래의 인덱스를 기반으로 정렬
//        Arrays.sort(indices, (a, b) -> {
//            if (refAlph[a].equals(refAlph[b])) {
//                // n번째 문자가 같은 경우 원래의 순서로 정렬
//                return Integer.compare(a, b);
//            } else {
//                return Character.compare(refAlph[a], refAlph[b]);
//            }
//        });
//
//        // 정렬된 인덱스를 기반으로 결과 배열 생성
//        for (int i = 0; i < strings.length; i++) {
//            answer[i] = strings[indices[i]];
//        }
//
//        return answer;

        Arrays.sort(strings, (s1, s2) -> {
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);
            if (c1 == c2) {
                return s1.compareTo(s2);
            } else {
                return Character.compare(c1, c2);
            }
        });

        return strings;
    }
}
