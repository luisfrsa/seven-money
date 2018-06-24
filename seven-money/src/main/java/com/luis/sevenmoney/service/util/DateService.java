package com.luis.sevenmoney.service.util;

import com.luis.sevenmoney.Exception.ApplicationException;
import org.springframework.http.HttpStatus;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class DateService {

    public static final String CAN_NOT_CALCULATE_DIFFERENCE_BETWEEN_TIMES_WHERE_BEGIN_END = "Can not calculate difference between times where begin bigger than end";

    public static Long diffBetweenDates(LocalDateTime begin, LocalDateTime end) {
        Long diff = ChronoUnit.SECONDS.between(begin, end);
        if (diff < 0) {
            throw new ApplicationException(CAN_NOT_CALCULATE_DIFFERENCE_BETWEEN_TIMES_WHERE_BEGIN_END, HttpStatus.BAD_REQUEST);
        }
        return diff;
    }

    public static Boolean isWeekend(DayOfWeek day) {
        List<DayOfWeek> weekends = Arrays.asList(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
        return weekends
                .stream()
                .anyMatch(wd -> day.equals(wd));
    }

    public static LocalDateTime createTodayAtNight(LocalDateTime date) {
        return LocalDateTime.of(
                date.getYear(),
                date.getMonthValue(),
                date.getDayOfMonth(),
                23, 59, 59
        );
    }

    public static LocalDateTime createTomorrowAtMorning(LocalDateTime date) {
        return LocalDateTime.of(
                date.getYear(),
                date.getMonthValue(),
                date.getDayOfMonth(),
                0, 0, 0
        ).plusDays(1);
    }

}
