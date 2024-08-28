package app.enums;

public enum WeekDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static boolean isInEnum(final String enumItemText) {
        for (WeekDay weekDay : WeekDay.values())
            if (weekDay.name().equals(enumItemText)) return true;
        return false;
    }
}
