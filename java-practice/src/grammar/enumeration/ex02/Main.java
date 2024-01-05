package grammar.enumeration.ex02;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button();

        button1.setMode(Button.Mode.DARK);
        button1.setSpace(Button.Space.DOUBLE);

        //문자열 비교
        System.out.println((Button.Mode.DARK.name()).equals("DARK") ? "깜장" : "흰둥");
        //순번비교
        System.out.println(Button.Mode.LIGHT.ordinal()==0?"첫번째":"두번째");
    }
}
