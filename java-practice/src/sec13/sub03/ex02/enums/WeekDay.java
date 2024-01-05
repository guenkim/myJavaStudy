package sec13.sub03.ex02.enums;

public enum WeekDay {
    MON("월"), TUE("화"), WED("수"),
    THU("목"), FRI("금");

    private String name;
    public String getName() {
        return name;
    }

    WeekDay(String name) {
        this.name = name;
    }
}