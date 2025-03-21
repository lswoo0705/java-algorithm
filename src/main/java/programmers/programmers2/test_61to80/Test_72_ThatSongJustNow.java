package programmers.programmers2.test_61to80;

public class Test_72_ThatSongJustNow {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int maxPlayTime = 0;

        m = convertMelody(m); // 입력 멜로디 변환 메서드

        for (String info : musicinfos) {
            String[] part = info.split(",");
            String startTime = part[0];
            String endTime = part[1];
            String title = part[2];
            String sheetMusic = convertMelody(part[3]); // 악보 변환

            int playTime = calculatePlayTime(startTime, endTime);
            String playedMelody = getPlayedMelody(sheetMusic, playTime);

            if (playedMelody.contains(m) && playTime > maxPlayTime) {
                maxPlayTime = playTime;
                answer = title;
            }
        }

        return answer;
    }

    // #이 붙은 음을 단일 문자로 변환
    private String convertMelody(String melody) {
        return melody.replace("C#", "H")
                .replace("D#", "I")
                .replace("F#", "J")
                .replace("G#", "K")
                .replace("A#", "L");
    }

    // 재생 시간 계산
    private int calculatePlayTime(String start, String end) {
        String[] startParts = start.split(":");
        String[] endParts = end.split(":");
        int startHour = Integer.parseInt(startParts[0]);
        int startMinute = Integer.parseInt(startParts[1]);
        int endHour = Integer.parseInt(endParts[0]);
        int endMinute = Integer.parseInt(endParts[1]);

        return (endHour * 60 + endMinute) - (startHour * 60 + startMinute);
    }

    // 실제 재생된 멜로디를 생성
    private String getPlayedMelody(String sheet, int playTime) {
        StringBuilder sb = new StringBuilder();
        int sheetLength = sheet.length();

        for (int i = 0; i < playTime; i++) {
            sb.append(sheet.charAt(i % sheetLength));
        }

        return sb.toString();
    }
}
