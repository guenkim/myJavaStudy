package sec05.sub04.ex03;

public class Product {

    private static double discount = 0.2;
    private static double increaseLimit = 1.2;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }


    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) return;
        this.name = name;
    }

    public int getPrice() {
        return (int) (price * (1 - discount));
    }

    public void setPrice(int price) {
        //  ⭐ this 사용 주의
        int max = (int) (this.price * increaseLimit);
        this.price = price < max ? price : max;
    }
}