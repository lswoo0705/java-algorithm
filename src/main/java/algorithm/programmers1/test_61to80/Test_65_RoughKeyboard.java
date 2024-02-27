package algorithm.programmers1.test_61to80;

public class Test_65_RoughKeyboard {
    public int[] solution(String[] keymap, String[] targets) {
//        int[] answer = new int[targets.length];
//        for (int i = 0; i < targets.length; i++) { // 타겟번호 "ABCD" "AABB"
//            for (int j = 0; j < targets[i].length(); j++) { // 타겟알파벳위치 "ABCD"
//                String word = String.valueOf(targets[i].charAt(j));
//
//                for (int k = 0; k < keymap.length; k++) { // 키맵 인덱스
//                    int keyCount = 0;
//                    if (keymap.length > 1) { // 인덱스가 1보다 크다면
//                        for (int l = 1; l < keymap.length; l++) { // 비교하면서 최소를 바꿔넣기
//                            if (keymap[k].indexOf(word) < keymap[l].indexOf(word)) {
//                                keyCount = keymap[k].indexOf(word);
//                            }
//                        }
//                    } else { // 인덱스가 1이라면
//
//                    }
//                    answer[i] += keyCount;
//                }
//            }
//        }
//        return answer;

        // 문자를 입력하기 위해 필요한 키와 횟수를 저장하는 배열
        int[][] pressCountArr = new int[26][2];
        for (int i = 0; i < 26; i++) {
            pressCountArr[i][0] = -1; // 처음에는 어떤 키도 할당되지 않음
            pressCountArr[i][1] = Integer.MAX_VALUE; // 무한으로 설정하여 최소값을 찾을 수 있게
        }

        // keymap을 돌리면서 각 문자에 대해 최소 키 입력 횟수를 계산
        for (int i = 0; i < keymap.length; i++) {
            String keys = keymap[i];
            for (int j = 0; j < keys.length(); j++) {
                char c = keys.charAt(j);
                int charIndex = c - 'A';
                // 같은 키에 여러 번 할당된 경우 최소 횟수만 저장
                if (j + 1 < pressCountArr[charIndex][1]) {
                    pressCountArr[charIndex][0] = i;
                    pressCountArr[charIndex][1] = j + 1;
                }
            }
        }

        // targets를 입력하기 위한 키 입력 횟수를 계산
        int[] result = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int presses = 0;
            for (int j = 0; j < target.length(); j++) {
                char c = target.charAt(j);
                int charIndex = c - 'A';
                if (pressCountArr[charIndex][0] == -1) { // 입력할 수 없는 문자가 있는 경우
                    presses = -1;
                    break;
                } else {
                    presses += pressCountArr[charIndex][1];
                }
            }
            result[i] = presses;
        }

        return result;
    }
}
