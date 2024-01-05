package sec08.practice02;

import sec07.sub04.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ints1 = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Number> numbers = new ArrayList<>();
        ArrayList<Knight> knights = new ArrayList<>();

        ints1.add(11);
        ints1.add(22);
        ints1.add(33);
        ints1.add(44);
        ints1.add(55);

        for (int i : ints1) {
            System.out.println(i);
        }

        for (String s : "바니 바니 바니 바니 당근 당근".split(" ")){
            System.out.println(s);
        }

        int size = ints1.size();
        boolean ints1Empty = ints1.isEmpty();
        Integer i = ints1.get(1);
        boolean contains = ints1.contains(33);
        boolean contains1 = ints1.contains(66);

        ints1.set(2,333);
        ints1.add(0,111);

        ArrayList<Integer> ints2A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> ints2B = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        ArrayList<Integer> ints2C = new ArrayList<>();

        Collections.addAll(ints2C,1,2,3,4,5);

        ArrayList<Integer> ints3 = new ArrayList<>(ints1);

        ArrayList<Integer> ints4 = (ArrayList<Integer>) ints3.clone();

        ints3.remove(4);
        ints3.remove((Integer) 55);

        ints1.removeAll(ints3);

        ints1.addAll(ints3);

        Object[] array = ints1.toArray();


        Integer[] ints1Ary2 = ints1.toArray(Integer[]::new);

        ints1.clear();

        numbers.add(Integer.valueOf(123));

        numbers.add(3.14);

        /*numbers.add("hello");*/

//        knights.add(new Swordman(Side.BLUE));
        knights.add(new Knight(Side.BLUE));
        knights.add(new MagicKnight(Side.RED));

        ArrayList<? extends Knight> eliteSquad;
        //eliteSquad = new ArrayList<Swordman>();
        eliteSquad = new ArrayList<Knight>();
        eliteSquad = new ArrayList<MagicKnight>();

        Knight knight = new Knight(Side.BLUE);
        knights.add(knight);

        knights.remove(knight);
        knights.remove(new Knight(Side.BLUE));

        ArrayList<Attacker> attackers = new ArrayList<>();
        attackers.ensureCapacity(5);
        attackers.trimToSize();


    }
}
