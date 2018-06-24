package com.luis.sevenmoney;

import com.luis.sevenmoney.Exception.ApplicationException;
import com.luis.sevenmoney.service.CoreService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import static com.luis.sevenmoney.service.util.DateService.*;
import static org.junit.Assert.assertEquals;

public class WeekDaysDateTests {

    @Autowired
    CoreService coreService;


    @Test
    public void itShouldValidateTonight() {
        LocalDateTime date = LocalDateTime.of(2018, 01, 01, 10, 0, 0);
        LocalDateTime target = LocalDateTime.of(2018, 01, 01, 23, 59, 59);
        LocalDateTime test = createTodayAtNight(date);
        assertEquals(target, test);
    }

    @Test
    public void itShouldValidateTomorrow() {
        LocalDateTime date = LocalDateTime.of(2018, 01, 01, 10, 0, 0);
        LocalDateTime target = LocalDateTime.of(2018, 01, 02, 00, 00, 00);
        LocalDateTime test = createTomorrowAtMorning(date);
        assertEquals(target, test);
    }

    @Test
    public void itShouldValidateWeekday1() {
        Boolean weekend = isWeekend(DayOfWeek.MONDAY);
        assertEquals(Boolean.FALSE, weekend);
    }

    @Test
    public void itShouldValidateWeekday2() {
        Boolean weekend = isWeekend(DayOfWeek.TUESDAY);
        assertEquals(Boolean.FALSE, weekend);
    }

    @Test
    public void itShouldValidateWeekday3() {
        Boolean weekend = isWeekend(DayOfWeek.WEDNESDAY);
        assertEquals(Boolean.FALSE, weekend);
    }

    @Test
    public void itShouldValidateWeekday4() {
        Boolean weekend = isWeekend(DayOfWeek.THURSDAY);
        assertEquals(Boolean.FALSE, weekend);
    }

    @Test
    public void itShouldValidateWeekday5() {
        Boolean weekend = isWeekend(DayOfWeek.FRIDAY);
        assertEquals(Boolean.FALSE, weekend);
    }

    @Test
    public void itShouldValidateWeekend1() {
        Boolean weekend = isWeekend(DayOfWeek.SATURDAY);
        assertEquals(Boolean.TRUE, weekend);
    }

    @Test
    public void itShouldValidateWeekend2() {
        Boolean weekend = isWeekend(DayOfWeek.SUNDAY);
        assertEquals(Boolean.TRUE, weekend);
    }


}
