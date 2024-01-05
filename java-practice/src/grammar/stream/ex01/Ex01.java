package grammar.stream.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> int0To9 = new ArrayList<>(
                Arrays.asList(5, 2, 0, 8, 4, 1, 7, 9, 3, 6)
        );
        //  홀수만 골라낸 다음 정렬하여 "1, 3, 5..."와 같은 문자열로 만들어보기

        //  기존의 방식
        List<Integer> odds = new ArrayList<>();
        for (Integer i : int0To9) {
            if (i % 2 == 1) odds.add(i);
        }
        odds.sort(Integer::compare); //올림차순 정렬
        odds.sort(Collections.reverseOrder()); // 내림차순 정렬

        List<String> oddsStrs = new ArrayList<>();
        for (Integer i : odds) {
            oddsStrs.add(String.valueOf(i));
        }
        String oddsStr = String.join(", ", oddsStrs);

        //  ⭐ 스트림을 사용한 방식
        //  각 라인이 무엇을 반환하는지 확인할 것
        String oddsStrStreamed = int0To9
                .stream()
                .filter(i -> i % 2 == 1)
                .sorted(Integer::compare)         //올림차순
                //.sorted((i1,i2)-> i2.compareTo(i1)) //내림차순
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
