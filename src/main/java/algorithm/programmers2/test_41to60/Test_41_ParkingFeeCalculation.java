package algorithm.programmers2.test_41to60;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test_41_ParkingFeeCalculation {
    public int[] solution(int[] fees, String[] records) {
        // 기본 요금 정보
        int basicTime = fees[0];
        int basicFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        // 차량별 누적 주차 시간을 저장
        Map<String, Integer> parkingTimeMap = new HashMap<>();
        // 차량의 마지막 들어오는 시간을 저장
        Map<String, String> inTimeMap = new HashMap<>();

        // 입출차 기록
        for (String record : records) {
            String[] recordInfo = record.split(" ");
            String time = recordInfo[0];
            String carNumber = recordInfo[1];
            String action = recordInfo[2];

            if (action.equals("IN")) { // 들어옴
                inTimeMap.put(carNumber, time);
            } else { // 나감
                String inTime = inTimeMap.get(carNumber);
                int parkingTime = calculateTimeDifference(inTime, time);
                parkingTimeMap.put(carNumber, parkingTimeMap.getOrDefault(carNumber, 0) + parkingTime);
                inTimeMap.remove(carNumber);
            }
        }

        // 나간 기록이 없을 경우 23:59에 나감
        String endTime = "23:59";
        for (Map.Entry<String, String> entry : inTimeMap.entrySet()) {
            String carNumber = entry.getKey();
            String inTime = entry.getValue();
            int parkingTime = calculateTimeDifference(inTime, endTime);
            parkingTimeMap.put(carNumber, parkingTimeMap.getOrDefault(carNumber, 0) + parkingTime);
        }

        // 차량별 요금
        Map<String, Integer> feeMap = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : parkingTimeMap.entrySet()) {
            String carNumber = entry.getKey();
            int totalTime = entry.getValue();
            int fee = calculateFee(totalTime, basicTime, basicFee, unitTime, unitFee);
            feeMap.put(carNumber, fee);
        }

        int[] answer = new int[feeMap.size()];
        int i = 0;
        for (int fee : feeMap.values()) {
            answer[i++] = fee;
        }

        return answer;
    }

    // 시간을 분으로 변환
    private int calculateTimeDifference(String inTime, String outTime) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            Date inDate = format.parse(inTime);
            Date outDate = format.parse(outTime);
            long difference = outDate.getTime() - inDate.getTime();
            return (int) (difference / 60000); // 밀리초를 분으로
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // 요금 계산
    private int calculateFee(int totalTime, int basicTime, int basicFee, int unitTime, int unitFee) {
        if (totalTime <= basicTime) {
            return basicFee;
        } else {
            return basicFee + (int) Math.ceil((double) (totalTime - basicTime) / unitTime) * unitFee;
        }
    }
}
