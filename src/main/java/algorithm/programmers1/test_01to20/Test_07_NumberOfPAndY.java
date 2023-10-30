package algorithm.programmers1.test_01to20;

public class Test_07_NumberOfPAndY {
    boolean solution(String s) {
        int numOfP = 0;
        int numOfY = 0;
        // 이거 쓰는거보다 if문에 || 넣는게 더 빠름
//        String str = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                numOfP++;
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                numOfY++;
            }
        }
        if (numOfP == numOfY) {
            return true;
        } else {
            return false;
        }
    }
}
