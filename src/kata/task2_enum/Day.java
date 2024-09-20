package kata.task2_enum;

public enum Day {
    MONDAY (false, "Понедельник"),
    TUESDAY(false, "Вторник"),
    WEDNESDAY(false, "Среда"),
    THURSDAY(false, "Четверг"),
    FRIDAY(false, "Пятница"),
    SATURDAY(true, "Суббота"),
    SUNDAY(true, "Воскресенье");

    private boolean isWeekend;
    private String name;

    Day(boolean isWeekend, String name) {
        this.isWeekend = isWeekend;
        this.name = name;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public String getRusName() {
        return name;
    }
}
