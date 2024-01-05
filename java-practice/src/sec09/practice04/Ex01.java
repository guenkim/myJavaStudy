package sec09.practice04;

import sec07.sub04.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01 {

    public static void main(String[] args) {
        List<Integer> int0To = new ArrayList<>(
                Arrays.asList(5, 2, 0, 8, 4, 1, 7, 9, 3, 6)
        );

        String collect = int0To.stream()
                .filter(i -> i % 2 == 1)
                .sorted(Integer::compare)
                .map(i -> String.valueOf(i))
                .collect(Collectors.joining(","));

        Integer[] integerAry = {1,2,3,4,5};
        Stream<Integer> fromArray_arr = Arrays.stream(integerAry);
        Object[] array = fromArray_arr.toArray();

        int[] intAry = {1,2,3,4,5};
        Stream<Integer> stream = Arrays.stream(intAry).boxed();
        
        double[] dbAry = {1.1,2.2,3.3};
        DoubleStream stream1 = Arrays.stream(dbAry);
        double[] fromDbAr = stream1.toArray();

        IntStream withInts = IntStream.of(1,2,3,4,5);
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Unit> swordmanStream = Stream.of(
                new Swordman(Side.BLUE),
                new Knight(Side.BLUE),
                new MagicKnight(Side.BLUE)
        );

        ArrayList<Integer> intAryList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Stream<Integer> fromColl1 = intAryList.stream();
        Object[] fromColl1_Arr = fromColl1.toArray();

        HashMap<String, Character> subjectGradeHM = new HashMap<>();
        subjectGradeHM.put("English",'B');
        subjectGradeHM.put("Math",'C');
        subjectGradeHM.put("Programing",'A');
        Object[] fromHashMap_arr = subjectGradeHM.entrySet().stream().toArray();

        Stream<Integer> withIter1 = Stream
                .iterate(0, i -> i + 2)
                .limit(10);
        Object[] withIteger1_arr = withIter1.toArray();

        Stream<String> withIter2 = Stream.iterate("홀", s -> s + (s.endsWith("홀") ? "짝" : "홀"))
                .limit(8);
        Object[] withIter2_arr = withIter2.toArray();

        IntStream fromRange1 = IntStream.range(0, 20);
        IntStream fromRange2 = IntStream.rangeClosed(0, 20);
        Stream<Integer> fromRangeBox = fromRange1.boxed();
        Stream<Integer> fromRangeBox_arr = fromRange2.boxed();

        IntStream randomInts = new Random().ints(5, 0, 100);
        int[] randomInts_arr = randomInts.toArray();

        DoubleStream randomDbls = new Random().doubles(5, 2, 3);
        double[] randomDbls_arr = randomDbls.toArray();

        IntStream fromString = "Hello World".chars();
        int[] fromString_Arr = fromString.toArray();

    }
}
