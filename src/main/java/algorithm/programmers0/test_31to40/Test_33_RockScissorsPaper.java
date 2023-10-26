package algorithm.programmers0.test_31to40;

public class Test_33_RockScissorsPaper {

//    char[] cRsp = rsp.toCharArray();
//    StringBuilder answer = new StringBuilder();
//
//        for(int i=0; i < cRsp.length; i++) {
//        switch(cRsp[i]) {
//            case '0' :
//                answer.append("5");
//                break;
//            case '2' :
//                answer.append("0");
//                break;
//            case '5' :
//                answer.append("2");
//                break;
//        }
//    }
//        return answer.toString();

    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            answer += rsp.charAt(i) == '2' ? "0" : rsp.charAt(i) == '0' ? "5" : "2";
        }
        return answer;
    }
}
