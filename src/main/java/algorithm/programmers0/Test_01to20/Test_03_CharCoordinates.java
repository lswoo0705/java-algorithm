package algorithm.programmers0.Test_01to20;

public class Test_03_CharCoordinates {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        int MaxX = (board[0] - 1) / 2;
        int MaxY = (board[1] - 1) / 2;
        for(String input : keyinput){
            switch (input) {
                case "up":
                    if (y < MaxY) {
                        y++;
                    }
                    break;
                case "down":
                    if (y > -MaxY) {
                        y--;
                    }
                    break;
                case "left":
                    if (x > -MaxX) {
                        x--;
                    }
                    break;
                case "right":
                    if (x < MaxX) {
                        x++;
                    }
                    break;
            }
        }
        int[] coordinate = new int[]{x, y};
        return coordinate;
    }
}
