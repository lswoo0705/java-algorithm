package programmers.programmers2.test_61to80;

public class Test_74_ParenthesesTransformation {
    public String solution(String p) {
        if (p.isEmpty()) return p;

        int index = getBalancedIndex(p);
        String u = p.substring(0, index + 1);
        String v = p.substring(index + 1);

        if (isCorrect(u)) {
            return u + solution(v);
        } else {
            StringBuilder sb = new StringBuilder("(");
            sb.append(solution(v));
            sb.append(")");
            sb.append(reverse(u.substring(1, u.length() - 1)));
            return sb.toString();
        }
    }

    private int getBalancedIndex(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') count++;
            else count--;
            if (count == 0) return i;
        }
        return -1;
    }

    private boolean isCorrect(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') count++;
            else {
                if (count == 0) return false;
                count--;
            }
        }
        return count == 0;
    }

    private String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(c == '(' ? ')' : '(');
        }
        return sb.toString();
    }
}
