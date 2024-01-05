package sec08.practice03;

import sec07.sub04.Side;
import sec07.sub04.Swordman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Object> intHSet = new HashSet<>();
        intHSet.add(1);
        intHSet.add(1);
        intHSet.add(2);
        intHSet.add(3);

        ArrayList<Integer> ints1 = new ArrayList<>(
                Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 6, 7)
        );

        HashSet<Integer> integerHashSet = new HashSet<>(ints1);
/*
        for (Integer i : integerHashSet) {
            System.out.println(i);
        }*/

        integerHashSet.stream()
                .forEach(System.out::println);

        ints1.clear();
        ints1.addAll(integerHashSet);

        boolean contains = integerHashSet.contains(2);
        boolean contains1 = integerHashSet.contains(4);

        boolean remove = integerHashSet.remove(2);
        boolean remove1 = integerHashSet.remove(4);

        Set<Swordman> swordmanSet = new HashSet<>();
        Swordman swordman = new Swordman(Side.RED);

        swordmanSet.add(swordman);
        swordmanSet.add(swordman);
        swordmanSet.add(new Swordman(Side.RED));
        swordmanSet.add(new Swordman(Side.RED));

        HashSet<Integer> intHashSet = new HashSet<>();
        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        for (int i : new int[]{3,1,8,5,4,7,2,9,6}) {
            intHashSet.add(i);
            integerLinkedHashSet.add(i);
            integerTreeSet.add(i);
        }

        for(Set s : new Set[] {intHashSet,integerLinkedHashSet,integerTreeSet}){
            System.out.println(s);
        }

        Set<String> strHashSet = new HashSet<>();
        Set<String> strLinkedHashSet = new LinkedHashSet<>();
        Set<String> strTreeSet = new TreeSet<>();

        for (String s : new String[] {
                "Fox", "Banana", "Elephant", "Car", "Apple", "Game", "Dice"
        }) {
            strHashSet.add(s);
            strLinkedHashSet.add(s);
            strTreeSet.add(s);
        }
        for (Set s : new Set[] {strHashSet, strLinkedHashSet, strTreeSet}) {
            System.out.println(s);
        }

    }


}
