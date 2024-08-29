package programmers.programmers1.test_21to40;

public class Test_35_LeastRectangle {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int width = size[0];
            int height = size[1];
            
            maxWidth = Math.max(maxWidth, Math.max(width, height));
            maxHeight = Math.max(maxHeight, Math.min(width, height));
        }

        return maxWidth * maxHeight;
    }
}
