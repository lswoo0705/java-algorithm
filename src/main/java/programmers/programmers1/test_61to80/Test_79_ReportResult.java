package programmers.programmers1.test_61to80;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Test_79_ReportResult {
    public int[] solution(String[] id_list, String[] report, int k) {
        /*
        // 신고내역에 중복을 제거
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        String[] deduplicatedReport = hashSet.toArray(new String[0]);

        int[] answer = new int[id_list.length];
        int[] numberOfTimesReported = new int[id_list.length];
        String[] personReported = new String[deduplicatedReport.length];
        String[] personReporting = new String[deduplicatedReport.length];

        // 신고받은 명단 배열
        for (int i = 0; i < deduplicatedReport.length; i++) {
            String[] parts = deduplicatedReport[i].split(" ");
            personReporting[i] = parts[0];
            personReported[i] = parts[1];
        }

        // 신고받은 명단을 기준으로 신고받은 횟수 카운트
        for (int i = 0; i < id_list.length; i++) {
            for (int j = 0; j < personReported.length; j++) {
                if (id_list[i].equals(personReported[j])) {
                    numberOfTimesReported[i]++;
                }
            }
        }

        for (int i = 0; i < numberOfTimesReported.length; i++) {
            if (numberOfTimesReported[i] >= k) { // 신고받은 횟수가 k번 이상인 사람의 인덱스
                for (int j = 0; j < deduplicatedReport.length; j++) {
                    if (personReported[j].equals(id_list[i])) { // 정지먹을 사람의 인덱스로 이름을 가져와서 report와 대조
                        for (int l = 0; l < id_list.length; l++) {
                            if (id_list[l].equals(personReporting[j])) { // reported의 인덱스로 reporting에 해당하는 사람을 ++
                                answer[l]++;
                            }
                        }
                    }
                }
            }
        }

        return answer;
        */
        // 성공. but 반복문과 조건문의 반복이 심함


        // HashMap 사용하여 탐색시간 개선
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> reportCount = new HashMap<>();

        // 신고된 횟수와 신고한 사람 관리 초기화
        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
            reportCount.put(id, 0);
        }

        // 신고 정보 처리
        for (String r : report) {
            String[] reportInfo = r.split(" ");
            String reporter = reportInfo[0];
            String reported = reportInfo[1];

            if (reportMap.get(reporter).add(reported)) {
                reportCount.put(reported, reportCount.get(reported) + 1);
            }
        }

        // 결과 계산
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> reporters = reportMap.get(id_list[i]);
            for (String reported : reporters) {
                if (reportCount.get(reported) >= k) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_79_ReportResult sol = new Test_79_ReportResult();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"}; String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}; int k = 2;
//        String[] id_list = {"con", "ryan"}; String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"}; int k = 3;
        System.out.println(Arrays.toString(sol.solution(id_list, report, k)));
    }
}
