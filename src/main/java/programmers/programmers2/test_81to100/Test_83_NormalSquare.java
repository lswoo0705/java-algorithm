package programmers.programmers2.test_81to100;

public class Test_83_NormalSquare { // 멀쩡한 사각형
    public long solution(int w, int h) {
        long answer = 1;
        // 1.큰 직사각형의 꼭지점을 잇는 대각선으로 자르는 것이므로 최소크기의 대각선 크기를 찾는다.
        // ex) 가로4 * 세로6 크기의 직사각형이 주어진다면 최소 크기는 가로2 * 세로3
        // w와 h의 최대공약수 구하기
        int gcd = gcd(w, h);
        int smallW = w / gcd;
        int smallH = h / gcd;

        // 2. 가로2 * 세로3 에서의 사용할 수 없는 정사각형의 개수를 구하고
        // smallW와 smallH 크기에서의 사용하지 못하는 정사각형의 개수는 항상 smallW + smallH - 1
        long unusableSquare = smallW + smallH - 1;

        // 3. 가로 또는 세로의 크기만큼 배수를 적용하면 총 사용할 수 없는 정사각형의 수를 구할 수 있다.
        answer = (long) w * h - unusableSquare * gcd;

        return answer;
    }

    // 유클리드 호제법으로 최대공약수 구하기
    private int gcd(int w, int h) {
        if (h == 0) {
            return w;
        }
        return gcd(h, w % h);
    }
}
