package sec08.practice04;

import sec07.sub04.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> numNameHMap = new HashMap<>();
        numNameHMap.put(1,"홍길동");
        numNameHMap.put(2,"전우치");
        numNameHMap.put(3,"임꺽정");

        Map<String,Double> nameHeightHMap = new HashMap<>();
        nameHeightHMap.put("김철수",176.8);
        nameHeightHMap.put("이장신",187.4);
        nameHeightHMap.put("박숏달",152.3);
        nameHeightHMap.put("정기준",171.2);

        Map<Side, ArrayList<Unit>> sideUnitsMap = new HashMap<>();
        sideUnitsMap.put(
          Side.BLUE,
                new ArrayList<>(
                    Arrays.asList(
                            new Swordman(Side.BLUE),
                            new Knight(Side.BLUE),
                            new MagicKnight(Side.BLUE)
                    )
                )
        );

        sideUnitsMap.put(
                Side.RED,
                new ArrayList<>(
                        Arrays.asList(
                                new Knight(Side.RED),
                                new Knight(Side.RED),
                                new Knight(Side.RED))
                )
        );


        Set<Integer> numSet = numNameHMap.keySet();
        Set<Integer> numHSet = new HashSet<>();
        numHSet.addAll(numSet);

        for (Integer n : numNameHMap.keySet()) {
            System.out.println(numNameHMap.get(n));
        }

        for (Side side : sideUnitsMap.keySet()) {
            for (Unit unit : sideUnitsMap.get(side)) {
                System.out.println(unit);
            }
        }


        Set<Map.Entry<Integer, String>> numNameES = numNameHMap.entrySet();
        for (Map.Entry<Integer, String> entry : numNameES) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("k: %d, v: %s%n", key, value);
        }

    }
}
