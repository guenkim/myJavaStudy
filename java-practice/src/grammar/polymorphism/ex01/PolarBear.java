package grammar.polymorphism.ex01;

public class PolarBear extends Mamal implements Hunter, Swimmer {
    public PolarBear() {
        super(false);
    }

    @Override
    public void hunt() {
        System.out.println(position + ": 물범 사냥");
    }

    @Override
    public void swim() {
        System.out.println("앞발로 수영");
    }


    @Override
    void abstractMethod() {
        System.out.println("구현 안하면 에러 발생");
    }
}
