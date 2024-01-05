package sec09.practice05;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        String[] names = {
                "강백호", "서태웅", "채치수", "송태섭", "정대만",
                "윤대협", "변덕규", "황태산", "안영수", "허태환",
                "이정환", "전호장", "신준섭", "고민구 ", "홍익현",
                "정우성", "신현철", "이명헌", "최동오", "정성구"
        };

        Stream<String> nameStream = Arrays.stream(names);
        Random random = new Random();
        random.setSeed(4);
        List<Person> people = nameStream
                .map(
                        name -> new Person(
                                name,
                                random.nextInt(18, 35),
                                random.nextDouble(160, 190),
                                random.nextBoolean()
                        ))
                .sorted()
                //.sorted((p1,p2) -> p1.getHeight() > p2.getHeight() ? 1:-1)
                //.sorted((p1,p2) -> Boolean.compare(p1.isMarried(),p2.isMarried()))
                .toList();

        Set<Character> collect = people.stream()
                .map(p -> p.getName().charAt(0))
                //.collect(Collectors.toList());
//                .collect(Collectors.toSet());
                //.collect(Collectors.toCollection(ArrayList::new))
                //.collect(Collectors.toCollection(LinkedList::new))
                .collect(Collectors.toCollection(TreeSet::new));

        Map<String, Integer> collect1 = people.stream()
                .sorted((p1, p2) -> p1.getAge() > p2.getAge() ? 1 : -1)
                .collect(Collectors.toMap(Person::getName, Person::getAge));


        Map<Boolean, List<Person>> map = people.stream()
                .collect(Collectors.groupingBy(Person::isMarried));
        List<Person> people1 = map.get(true);

        Map<Integer, List<Person>> collect2 = people.stream()
                .collect(Collectors.groupingBy(p -> (int) p.getHeight() / 10 * 10));
        List<Person> over180s = collect2.get(180);

        Map<Character, List<Integer>> collect3 = IntStream.range(0, 10).boxed()
                .collect(Collectors.groupingBy(i -> i % 2 == 1 ? '홀' : '짝'));
        collect3.get('홀');
    }

}
