package sec08.practice05;

import sec07.sub04.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Integer int1 = Integer.valueOf(111);
        Integer int2 = Integer.valueOf(222);
        Integer int3 = Integer.valueOf(333);

        //대상보다 작을 때 -1, 같을때 0, 클때 1
        int _1_comp_3 = int1.compareTo(333);
        int _2_comp_1 = int2.compareTo(111);
        int _3_comp_3 = int3.compareTo(333);
        int _t_comp_f = Boolean.valueOf(true).compareTo(Boolean.valueOf(false));
        int _abc_comp_def = "ABC".compareTo("DEF");
        int _efgh_comp_abcd = "efgh".compareTo("abcd");

        Integer[] nums = {3,8,1,7,4,9,2,6,5};
        String[] strs =  {"Fox", "Banana", "Elephant", "Car", "Apple", "Game", "Dice"};

        Arrays.sort(nums);
        Arrays.sort(strs);

        Arrays.sort(nums,new IntDescComp());

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
                return o2.length() - o1.length();
            }
        });

        ArrayList<Integer> numsArray = new ArrayList<>(Arrays.asList(nums));
        numsArray.sort(new IntDescComp());

        numsArray.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1%2) - (o2%2);
            }
        });

        TreeSet<Unit> unitSet = new TreeSet<>(new UnitSorter());
        for(Unit u : new Unit[]{
                new Knight((Side.BLUE)),
                new Knight((Side.BLUE)),
                new Swordman(Side.RED),
                new Swordman(Side.RED),
                new MagicKnight(Side.BLUE),
                new Swordman(Side.BLUE),
                new MagicKnight(Side.RED),
                new Knight(Side.RED)
        }){
            unitSet.add(u);
        }
    }
}
