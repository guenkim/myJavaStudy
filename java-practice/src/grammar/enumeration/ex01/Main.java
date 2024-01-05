package grammar.enumeration.ex01;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button();

        button1.setButtonMode(ButtonMode.DARK);
        button1.setButtonSpace(ButtonSpace.TRIPLE);

        //열거형 값
        System.out.println(ButtonMode.LIGHT);
        System.out.println(ButtonMode.DARK);
        //열거 순서
        System.out.println(ButtonMode.LIGHT.ordinal());
        System.out.println(ButtonMode.DARK.ordinal());


        //  ⚠️ 아래와 같은 오용이 방지됨
//        button1.setButtonMode(ButtonSpace.DOUBLE);
    }
}
