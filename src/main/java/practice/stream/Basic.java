package practice.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Basic {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // 1. 2011년에 일어난 모든 트랜잭션을 찾아 값을 오름차순으로 정렬하시오.
        List<Integer> answer1 = transactions.stream()
                .filter(t -> t.getYear() == 2011) // 2011년도 필터링하는 람다식
                .map(Transaction::getValue) // map을 이용해서 트랜잭션의 value를 추출
                .sorted() // 오름차순 정렬
                .collect(Collectors.toList()); // 스트림의 결과를 리스트로 수집

        System.out.println("1번 : " + answer1);

        // 2. 2011년에 일어난 모든 트랜잭션을 찾아 값을 기준으로 오름차순으로 정렬하시오.
        List<Transaction> answer2 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue)) // 트랜잭션 값을 기준으로 오름차순 정렬
                .collect(Collectors.toList());

        System.out.println("2번 : " + answer2);

        // 3. 거래자가 근무하는 모든 도시를 중복 없이 나열하시오.
        List<String> answer3 = transactions.stream()
                .map(Transaction::getTrader) // 각 트랜잭션에서 거래자를 추출
                .map(Trader::getCITY) // 각 거래자에서 도시를 추출
                .distinct() // 중복 제거
                .collect(Collectors.toList()); // 리스트로 수집

        System.out.println("3번 : " + answer3);

        // 4. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.
        List<Trader> answer4 = transactions.stream()
                .map(Transaction::getTrader) // 트랜잭션에서 거래자를 추출
                .filter(t -> t.getCITY().equals("Cambridge")) // 거래자의 근무지가 켐브릿지인 사람을 필터링
                .sorted(Comparator.comparing(Trader::getName)) // 이름 기준 오름차순 정렬
                .collect(Collectors.toList());

        System.out.println("4번 : " + answer4);

        // 5. 모든 거래자의 이름을 알파벳 역순으로 정렬해서 반환하시오.
        List<String> answer5 = transactions.stream()
                .map(Transaction::getTrader) // 거래자를 추출
                .map(Trader::getName)
                .distinct() // 중복 제거
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("5번 : " + answer5);

        // 6. 밀라노에 거래자가 있는가?
        boolean answer6 = transactions.stream()
                .anyMatch(t -> t.getTrader().getCITY().equals("Milan"));

        System.out.println("6번 : " + answer6);

        // 7. 케임브리지에 거주하는 거래자의 모든 트랜잭션 값을 출력하시오.
        List<Integer> answer7 = transactions.stream()
                .filter(t -> t.getTrader().getCITY().equals("Cambridge"))
                .map(Transaction::getValue)
                .collect(Collectors.toList());

        System.out.println("7번 : " + answer7);


        // 8. 전체 트랜잭션 중 최댓값은 얼마인가?
        Integer answer8 = transactions.stream()
                .map(Transaction::getValue)
                .reduce(0, Integer::max);

        System.out.println("8번 : " + answer8);
    }
}
