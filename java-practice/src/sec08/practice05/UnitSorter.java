package sec08.practice05;



import sec07.sub04.*;

import java.util.Comparator;

public class UnitSorter implements Comparator<Unit> {
    @Override
    public int compare(Unit o1, Unit o2) {
        int result = getClassPoint(o2) - getClassPoint(o1);
        return result;
    }

    public int getClassPoint(Unit u){
        int result = u.getSide() == Side.RED ? 10 : 0;
        if(u instanceof Swordman) result += 1;
        if(u instanceof Knight) result += 2;
        if(u instanceof MagicKnight) result += 3;
        return result;
    }
}
