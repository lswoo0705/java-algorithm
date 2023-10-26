package algorithm.programmers0.Test_21to30;

public class Test_26_AntCorps {
    public int solution(int hp) {
        int answer = 0;
        int general = 0;
        int soldier = 0;
        int worker = 0;
        if (hp >= 5) {
            general = hp / 5;
            soldier = (hp % 5) / 3;
            worker = (hp % 5) % 3;
        } else if (hp >= 3) {
            soldier = hp / 3;
            worker = hp % 3;
        } else if (hp > 0) {
            worker = hp;
        }
        answer = general + soldier + worker;
        return answer;
    }
}
