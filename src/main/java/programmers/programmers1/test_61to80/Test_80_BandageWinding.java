package programmers.programmers1.test_61to80;

public class Test_80_BandageWinding {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // bandage : 시간(동안), 초당회복량, 성공후 추가회복량
        // health : 최대체력, 공격이 끝난 직후 남은 체력, 죽으면 -1
        // attacks : {공격시간, 피해량}
        int maxHealth = health;
        int successesCount = 0;
        int time = 1;
        int attackIndex = 0;

        while (time <= attacks[attacks.length - 1][0]) {
            // 회복
            if (time != attacks[attackIndex][0]) { // 공격을 받지 않았다면
                successesCount++;
                health += bandage[1];
                if (successesCount == bandage[0]) { // 연속회복이 성공했다면
                    health += bandage[2];
                    successesCount = 0;
                }
                if (health > maxHealth) { // 체력이 최대체력을 넘는다면
                    health = maxHealth;
                }
            } else if (time == attacks[attackIndex][0]) { // 공격을 받았다면
                health -= attacks[attackIndex][1];
                successesCount = 0;
                if (health < 1) {
                    return -1;
                }
                attackIndex++;
            }
            time++;
        }

        return health;
    }

    public static void main(String[] args) {
        Test_80_BandageWinding sol = new Test_80_BandageWinding();
        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        System.out.println(sol.solution(bandage, health, attacks));
    }
}
