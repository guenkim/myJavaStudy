package grammar.generic.ex05;

public class Horse<T extends Unit> {
    private T rider;

    public void setRider(T rider) {
        this.rider = rider;
    }
}