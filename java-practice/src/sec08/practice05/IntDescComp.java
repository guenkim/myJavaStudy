package sec08.practice05;

import java.util.Comparator;

public class IntDescComp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
