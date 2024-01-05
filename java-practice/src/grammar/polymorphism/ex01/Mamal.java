package grammar.polymorphism.ex01;


public abstract class Mamal {
    public boolean hibernation;

    abstract void abstractMethod();

    public Mamal(){

    }

    public Mamal(boolean hibernation) {
        this.hibernation = hibernation;
    }
}