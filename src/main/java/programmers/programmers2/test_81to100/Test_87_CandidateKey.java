package programmers.programmers2.test_81to100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test_87_CandidateKey { // 후보키
    public int solution(String[][] relation) {
        // 1. 컬럼들의 모든 조합을 만든다.
        // 2. 유일성을 확인하기 위해 중복을 검사해야하므로 Set을 사용한다.
        // 3. 다른 후보키들과 비교해서 최소성 확인.
        int answer = 0;
        int rowSize = relation.length; // 튜플의 개수
        int colSize = relation[0].length; // 속성의 개수

        // 후보키들의 조합
        List<Integer> candidateKeys = new ArrayList<>();

        // 1부터 모든 컬럼 조합을 순회
        for (int i = 1; i < (1 << colSize); i++) {
            Set<String> tupliSet = new HashSet<>();

            // 각각의 행들의 값들을 조합
            for (int row = 0; row < rowSize; row++) {
                StringBuilder key = new StringBuilder();
                for (int col = 0; col < colSize; col++) {
                    if ((i & (1 << col)) != 0) { // 현재 컬럼이 조합에 포함되어있는지
                        key.append(relation[row][col]).append(",");
                    }
                }
                tupliSet.add(key.toString());
            }

            // 유일성 검사 -> 튜플 개수가 행 개수와 같이야함
            if (tupliSet.size() != rowSize) {
                continue;
            }

            // 최소성 검사 -> 기존의 후보키 중 현재 조합에 포함되어있으면 안됨
            boolean isMinimality = true;
            for (int candidateKey : candidateKeys) {
                if ((candidateKey & i) == candidateKey) { // 기존의 후보키가 현재 조합의 부분이라면 최소성을 만족하지 못함
                    isMinimality = false;
                    break;
                }
            }

            // 모든 조건을 만족하므로 후보키에 추가
            if (isMinimality) {
                candidateKeys.add(i);
            }
        }

        answer = candidateKeys.size();
        return answer;
    }
}
