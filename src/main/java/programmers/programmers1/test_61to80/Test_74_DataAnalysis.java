package programmers.programmers1.test_61to80;

import java.util.*;
import java.util.stream.Collectors;

public class Test_74_DataAnalysis {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // int[][] data = {["코드 번호(code)", "제조일(date)", "최대 수량(maximum)", "현재 수량(remain)"], ...}
        // ext : 필터링 기준으로 할 데이터
        // val_ext : 필터링 기준 값
        // sort_by : 오름차순으로 할 기준 데이터

//        List<List<Integer>> arr = new ArrayList<>();
//
//        switch (ext) {
//            case "code" -> {
//                for (int i = 0; i < data.length; i++) {
//                    if (data[i][0] < val_ext) {
//                        List<Integer> row = new ArrayList<>();
//                        for (int j = 0; j < data[i].length; j++) {
//                            row.add(data[i][j]);
//                        }
//                        arr.add(row);
//                    }
//                }
//            }
//            case "date" -> {
//                for (int i = 0; i < data.length; i++) {
//                    if (data[i][1] < val_ext) {
//                        List<Integer> row = new ArrayList<>();
//                        for (int j = 0; j < data[i].length; j++) {
//                            row.add(data[i][j]);
//                        }
//                        arr.add(row);
//                    }
//                }
//            }
//            case "maximum" -> {
//                for (int i = 0; i < data.length; i++) {
//                    if (data[i][2] < val_ext) {
//                        List<Integer> row = new ArrayList<>();
//                        for (int j = 0; j < data[i].length; j++) {
//                            row.add(data[i][j]);
//                        }
//                        arr.add(row);
//                    }
//                }
//            }
//            case "remain" -> {
//                for (int i = 0; i < data.length; i++) {
//                    if (data[i][3] < val_ext) {
//                        List<Integer> row = new ArrayList<>();
//                        for (int j = 0; j < data[i].length; j++) {
//                            row.add(data[i][j]);
//                        }
//                        arr.add(row);
//                    }
//                }
//            }
//        }
//
//        int[][] answer = new int[arr.size()][data[0].length];
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = 0; j < arr.get(i).size(); j++) {
//                answer[i][j] = arr.get(i).get(j);
//            }
//        }
//
//        int sortIndex = switch (sort_by) {
//            case "date" -> 1;
//            case "maximum" -> 2;
//            case "remain" -> 3;
//            default -> 0;
//        };
//
//        Arrays.sort(answer, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[sortIndex] - o2[sortIndex];
//            }
//        });
//
//        return answer;

        // -> 스트림 개선

        List<List<Integer>> arr = new ArrayList<>();

        // 데이터 필터링
        int extIndex = -1;
        switch (ext) {
            case "code":
                extIndex = 0;
                break;
            case "date":
                extIndex = 1;
                break;
            case "maximum":
                extIndex = 2;
                break;
            case "remain":
                extIndex = 3;
                break;
        }

        for (int[] row : data) {
            if (row[extIndex] < val_ext) {
                arr.add(Arrays.stream(row).boxed().collect(Collectors.toList()));
            }
        }

        // 리스트를 배열로 변환
        int[][] answer = arr.stream().map(list -> list.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);

        // 정렬
        int sortIndex = switch (sort_by) {
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };

        Arrays.sort(answer, Comparator.comparingInt(arr2 -> arr2[sortIndex]));

        return answer;
    }
}
