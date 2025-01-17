package programmers.programmers2.test_41to60;

import java.util.Arrays;

public class Test_53_SortFileNames {
    public String[] solution(String[] files) {
        // 파일명을 객체로 변환 후 정렬
        Arrays.sort(files, (file1, file2) -> {
            String[] parts1 = splitName(file1);
            String[] parts2 = splitName(file2);

            // HEAD 비교 (대소문자 구분 X)
            int headCompare = parts1[0].toLowerCase().compareTo(parts2[0].toLowerCase());
            if (headCompare != 0) {
                return headCompare;
            }

            // NUMBER 비교 (숫자 크기 비교)
            int num1 = Integer.parseInt(parts1[1]);
            int num2 = Integer.parseInt(parts2[1]);
            return Integer.compare(num1, num2);
        });

        return files;
    }

    // 파일명을 HEAD, NUMBER, TAIL로 분리하는 메서드
    private String[] splitName(String file) {
        StringBuilder head = new StringBuilder();
        String number = "";
        String tail = "";

        int idx = 0;

        // HEAD 추출
        while (idx < file.length() && !Character.isDigit(file.charAt(idx))) {
            head.append(file.charAt(idx));
            idx++;
        }

        // NUMBER 추출 (최대 5자리)
        while (idx < file.length() && Character.isDigit(file.charAt(idx)) && number.length() < 5) {
            number += file.charAt(idx);
            idx++;
        }

        // TAIL 추출
        tail = file.substring(idx);

        return new String[]{head.toString(), number, tail};
    }
}
