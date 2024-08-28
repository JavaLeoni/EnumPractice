package app.clasess;

import app.enums.WeekDay;
import app.interfaces.IAdvise;

public class Adviser implements IAdvise {
    @Override
    public String advice(WeekDay weekDay) {
        return switch (weekDay) {
            case MONDAY -> "Понеділок - це тільки початок";
            case TUESDAY -> "Вівторок - вже трохи легше";
            case WEDNESDAY -> "Середа - працюємо";
            case THURSDAY -> "Працюємо не зупиняємося";
            case FRIDAY -> "Happy Friday!";
            case SATURDAY -> "Там де ще не були";
            case SUNDAY -> "Всюди добре а вдома найкраще...";
        };
    }
}
