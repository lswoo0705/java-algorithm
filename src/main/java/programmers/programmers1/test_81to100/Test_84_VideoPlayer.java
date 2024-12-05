package programmers.programmers1.test_81to100;

import javax.swing.*;

public class Test_84_VideoPlayer {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer;
        int videoLenSec = splitMinute(video_len);
        int posSec = splitMinute(pos);
        int opStartSec = splitMinute(op_start);
        int opEndSec = splitMinute(op_end);

        if (posSec >= opStartSec && posSec <= opEndSec) {
            posSec = opEndSec;
        }

        for (String command : commands) {
            switch (command) {
                case "prev" -> {
                    if (posSec > 10) {
                        posSec -= 10;
                    } else {
                        posSec = 0;
                    }
                }
                case "next" -> {
                    if (posSec < videoLenSec - 10) {
                        posSec += 10;
                    } else {
                        posSec = videoLenSec;
                    }
                }
            }

            if (posSec >= opStartSec && posSec <= opEndSec) {
                posSec = opEndSec;
            }
        }

        int minutes = posSec / 60;
        int seconds = posSec % 60;
        answer = String.format("%02d:%02d", minutes, seconds);

        return answer;
    }

    private int splitMinute(String input) {
        String[] minSec = input.split(":");
        int min = Integer.parseInt(minSec[0]) * 60;
        int sec = Integer.parseInt(minSec[1]);
        return min + sec;
    }
    
}
