package sec06.sub07.ex02;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();

        Button.ClickInfo click1 = button.func(123, 456, Button.ClickedBy.LEFT);
        Button.ClickInfo click2 = button.func(492, 97, Button.ClickedBy.LEFT);
        Button.ClickInfo click3 = button.func(12, 36, Button.ClickedBy.RIGHT);

        for (Button.ClickInfo click : new Button.ClickInfo [] { click1, click2, click3 }) {
            click.printInfo();
        }

        System.out.println("\n- - - - -\n");

        Button.ClickInfo click4 = button.func(111, 222, Button.ClickedBy.LEFT);
        Button.ClickInfo click5 = button.func(111, 222, Button.ClickedBy.LEFT);

        //  ⭐️  레코드 역시 참조형
        //  내용이 같은지 여부는 equals 메소드로 확인
        boolean click4n5Same = click4 == click5;
        boolean click4n5Equal = click4.equals(click5);
        boolean click4n1Equal = click4.equals(click1);

        //📌추가사항
        //- 클래스 내부에 정의된 record는 내부 정적 클래스처럼 아래와 같이 사용할 수 있습니다.

        Button.ClickInfo click6 = new Button.ClickInfo(111, 222, Button.ClickedBy.LEFT);
    }
}
