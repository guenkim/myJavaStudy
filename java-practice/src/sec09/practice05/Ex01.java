package sec09.practice05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,99)
                .filter(i->i%2==0)
                .skip(10)
                //.peek(System.out::println)
                //.limit(10)
                //.map(i->i*10)
                .forEach(System.out::println);

        System.out.println("\n---------------------------\n");

        String str1 = "Hello World! Welcome to the world of Java~";
        str1.chars().forEach(System.out::println);

        System.out.println("\n---------------------------\n");
        str1.chars()
                .max()
                .getAsInt();

        str1.chars()
                .sorted()
                .distinct()
                .filter(i->(i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z'))
                .forEach(i-> System.out.println((char)i));

        System.out.println("\n---------------------------\n");

        String fromStr1 = str1.chars().boxed()
                .map(i -> String.valueOf((char) i.intValue()))
                .map(String::toUpperCase)
                .peek(System.out::println)
                .filter(s -> Character.isLetter(s.charAt(0)))
                .peek(System.out::println)
                .sorted()
                .distinct()
                .collect(Collectors.joining(", "));

        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
        
        IntStream.range(0,10).boxed()
                .peek(i -> System.out.println("초기값:"+i))
                .filter(i->i%2==1)
                .peek(i-> System.out.println("홀수만:"+i))
                .map(i->i*i)
                .peek(i-> System.out.println("제곱:"+i))
                //.sorted((i1,i2)-> i1>i2? 1:-1) //오름차순
//                .peek(i-> System.out.println("오름차순:"+i))
                .sorted((i1,i2)-> i1<i2? 1:-1) //내림차순
                .peek(i-> System.out.println("내림차순:"+i))
                .map(String::valueOf)
                .collect(Collectors.joining(", "));


        Integer[] ints = {1,2,3,4,5,6,7,8,9};
        boolean intsMatch = Arrays.stream(ints)
                //.allMatch(i -> i > 0);
                //.allMatch(i->i%2==0)
                //.anyMatch(i->i<0)
                .anyMatch(i->i%2==0);

        List<Integer> collect = Arrays.stream(ints)
                .takeWhile(i -> i < 4)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
