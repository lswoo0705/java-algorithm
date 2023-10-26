package algorithm.programmers0.Test_61to70;

public class Test_67_CkickenCoupon {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;

        while (chicken > 0) {
            coupon++;
            chicken--;
            if (coupon >= 10) {
                chicken++;
                coupon -= 10;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_67_CkickenCoupon sol = new Test_67_CkickenCoupon();
//        int chicken = 10; // 1
//        int chicken = 100; // 11
//        int chicken = 200; // 22
        int chicken = 1081; // 120
        System.out.println(sol.solution(chicken));
    }
}
