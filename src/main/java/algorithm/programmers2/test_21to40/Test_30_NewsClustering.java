package algorithm.programmers2.test_21to40;

import java.util.ArrayList;
import java.util.List;

public class Test_30_NewsClustering {
    public int solution(String str1, String str2) {
        // 문자열로부터 다중집합 생성
        List<String> multiset1 = generateMultiset(str1);
        List<String> multiset2 = generateMultiset(str2);
        // 교집합과 합집합을 저장할 리스트
        List<String> intersection = new ArrayList<>();
        List<String> union = new ArrayList<>(multiset1);

        // multiset2의 각 요소에 대해 처리
        for (String s : multiset2) {
            if (multiset1.contains(s)) { // multiset1에 요소가 있으면 교집합에 추가하고 multiset1에서 제거
                intersection.add(s);
                multiset1.remove(s);
            } else { // 요소가 없으면 합집합에 추가
                union.add(s);
            }
        }

        // 합집합이 비어 있는 경우, 두 집합이 모두 공집합이므로 65536 반환
        if (union.size() == 0) {
            return 65536;
        }

        // 자카드 유사도 계산 : 교집합 크기 / 합집합 크기
        double jaccardSimilarity = (double) intersection.size() / union.size();

        // 자카드 유사도에 65536을 곱하고 정수부만 반환
        return (int) (jaccardSimilarity * 65536);
    }

    private List<String> generateMultiset(String str) {
        List<String> multiset = new ArrayList<>();
        str = str.toLowerCase();

        for (int i = 0; i < str.length() - 1; i++) {
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            if (Character.isLetter(first) && Character.isLetter(second)) {
                multiset.add(str.substring(i, i + 2));
            }
        }
        return multiset;
    }
}
