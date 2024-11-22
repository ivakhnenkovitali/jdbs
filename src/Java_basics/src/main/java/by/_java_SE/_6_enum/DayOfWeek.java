package by._java_SE._6_enum;

import java.util.StringJoiner;

public enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    // какое-то поле
    DayOfWeek() {
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DayOfWeek.class.getSimpleName() + "[", "]")
                .toString();
    }

}
