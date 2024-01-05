package sec10.practice06;

import sec07.sub04.*;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;

public class Ex02 {
    public static void main(String[] args) {
        Optional<String> catOpt = Optional.of("Cat");
        //catOpt = Optional.of(null);

        Optional<String> dogOpt = Optional.ofNullable("Dog");
        Optional<Object> cowOpt = Optional.ofNullable(null);

        Optional<Object> henOpt = Optional.empty();

        List<Optional<Unit>> randomUnitOpts = new ArrayList<>();
        IntStream.range(0,20)
                .forEach(i->randomUnitOpts.add(randomUnitOpt()));

        randomUnitOpts.stream()
                .forEach(opt-> System.out.println(
                        //opt.isPresent()
                        //opt.isEmpty()
                        //opt.get()
                        opt.orElse(new Swordman(Side.RED))
                ));

        System.out.println("\n------------------------\n");

        List<Optional<Integer>> optIts = new ArrayList<>();
        IntStream.range(0,20)
                .forEach(i->{
                    optIts.add(Optional.ofNullable(new Random().nextBoolean()?i:null));
                });

        optIts.stream()
                .forEach(
                        opt->{
                            System.out.println(
                                    //opt.filter(i->i%2==1)
                                    opt.map(i->"%d 출력".formatted(i))
                                            .orElse("(skip)")
                            );
                        }
                );
    }

    public static Optional<Unit> randomUnitOpt(){
        switch (new Random().nextInt(0,3)){
            case 0: return Optional.of(new Knight(Side.BLUE));
            case 1: return Optional.of(new MagicKnight(Side.BLUE));
            default:return Optional.empty();
        }
    }
}
