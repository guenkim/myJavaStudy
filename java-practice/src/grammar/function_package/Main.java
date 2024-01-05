package grammar.function_package;

import sec07.sub04.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Runnable dogButtonFunc = () -> System.out.println("멍멍");
        Runnable catButtonFunc = () -> System.out.println("야용");
        Runnable cowButtonFunc = () -> System.out.println("음메");
        dogButtonFunc.run();
        catButtonFunc.run();
        cowButtonFunc.run();

        Button dogButton = new Button("강아지");
        dogButton.setOnClickListener(dogButtonFunc);

        System.out.println("\n----------------\n");
        Button catButton = new Button("고양이");
        catButton.setOnClickListener(()->
            {
                System.out.println("---------------");
                System.out.println(catButton.getText()+" 울음소리: 야옹야옹");
                System.out.println("---------------");
            }
        );

        dogButton.onClick();
        catButton.onClick();

        Supplier<String> appName = ()->"얄코오피스";
        String s = appName.get();
        
        Supplier<Double> rand0to10 = () -> Math.random()*10;
        Double v = rand0to10.get();

        Supplier<Boolean> randTF = () -> Math.random() > 0.5;
        Boolean b = randTF.get();

        System.out.println("\n---------------------------------\n");

        Consumer<Integer> sayOddEven = i -> System.out.printf("%d은 %c수 입니다.%n",i,"짝홀".charAt(i%2));
        sayOddEven.accept(3);
        sayOddEven.accept(4);

        Consumer<Button> clickButton = bb -> bb.onClick();
        clickButton.accept(catButton);

        BiConsumer<Button,Integer> clickButtonTimes  = (bbb, n) -> {
            for(int i=0; i < n ; i++){
                bbb.onClick();
            }
        };

        clickButtonTimes.accept(dogButton,5);

        System.out.println("\n---------------------------\n");

        Function<Integer,Boolean> isOdd = i -> i%2==1;
        Boolean isOdd3 = isOdd.apply(1);

        Function<String, Button> getButton = ss -> new Button(ss);
        Button goatButton = getButton.apply("염소");

        BiFunction<Unit, Horse,Integer> getFullHP = (u,h) -> {
            h.setRider(u);
            return u.hp;
        };

        BiFunction<String,Runnable, Button> getButtonWFunc = (sss, rr) -> {
            Button bbbb = new Button(sss);
            bbbb.setOnClickListener(rr);
            return bbbb;
        };

        Integer apply = getFullHP.apply(new MagicKnight(Side.RED), new Horse(80));
        getButtonWFunc.apply("오리",()-> System.out.println("꽥꽥")).onClick();

        Predicate<Integer> isOddTester = i->i%2==1;
        Predicate<String> isAllLowerCase = s1 -> s1.equals(s1.toLowerCase());

        BiPredicate<Character,Integer> areSameCharNum = (c,i) -> (int)c == i;
        BiPredicate<Unit,Unit> areSameSide = (u,u2) -> u.getSide()==u2.getSide();

        boolean test = isOddTester.test(3);
        boolean test1 = isOddTester.test(4);

        boolean test2 = isAllLowerCase.test("HELLO");
        boolean test3 = isAllLowerCase.test("world");

        boolean test4 = areSameCharNum.test('A', 64);
        boolean test5 = areSameCharNum.test('A', 65);

        boolean test6 = areSameSide.test(new Knight(Side.RED), new Knight(Side.BLUE));
        boolean test7 = areSameSide.test(new Swordman(Side.RED), new MagicKnight(Side.BLUE));

        UnaryOperator<Swordman> respawn = swordman -> {
            if(swordman instanceof MagicKnight) return new MagicKnight(swordman.getSide());
            if(swordman instanceof Knight) return new Knight(swordman.getSide());
            return new Swordman(swordman.getSide());
        };

        respawn.apply(new Knight(Side.BLUE));
        respawn.apply(new MagicKnight(Side.RED));

        System.out.println("\n----------------------------\n");

        new ArrayList<>(
                Arrays.asList("하나","둘","셋","넷","다섯")
        ).forEach(s1 -> System.out.println(s1));

        Map<String,Character> subjectGradeHm = new HashMap<>();
        subjectGradeHm.put("En",'b');
        subjectGradeHm.put("Math",'C');
        subjectGradeHm.put("Program",'A');

        String test33 ="test";
        ArrayList<String> aStr = new ArrayList<>();
        ArrayList<Character> aChar = new ArrayList<>();
        subjectGradeHm.forEach(
                (s3,c)-> {
                    aStr.add(s3);
                    aChar.add(c);
                    System.out.println("%s : %c".formatted(s3,c));
                    System.out.println(test33);
                }
        );
    }
}
