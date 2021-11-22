package de.apnmt.organizationappointment.common.domain.enumeration;

import java.time.DayOfWeek;

/**
 * The Day enumeration.
 */
public enum Day {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;

    public static Day getDay(DayOfWeek day) {
        switch (day) {
            case MONDAY:
                return Monday;
            case TUESDAY:
                return Tuesday;
            case WEDNESDAY:
                return Wednesday;
            case THURSDAY:
                return Thursday;
            case FRIDAY:
                return Friday;
            case SATURDAY:
                return Saturday;
            case SUNDAY:
                return Sunday;
        }
        return null;
    }
}
