package com.luis.sevenmoney;

import com.luis.sevenmoney.Exception.ApplicationException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static com.luis.sevenmoney.service.util.DateService.diffBetweenDates;
import static org.junit.Assert.assertEquals;

public class DiffDateTests {

    //Using TDD, and it takes a little more time to develop

    @Rule
    public ExpectedException expectation = ExpectedException.none();

    @Test
    public void should_calculate_diff_between_dates_seconds() {
        LocalDateTime first = LocalDateTime.now();
        LocalDateTime seccond = LocalDateTime.now().plusSeconds(20);
        Long diff = diffBetweenDates(first, seccond);
        assertEquals(Long.valueOf(20L), diff);
    }

    @Test
    public void should_calculate_diff_between_dates_minutes() {
        LocalDateTime first = LocalDateTime.now();
        LocalDateTime seccond = LocalDateTime.now().plusMinutes(150);
        Long diff = diffBetweenDates(first, seccond);
        assertEquals(Long.valueOf(9000L), diff);
    }

    @Test
    public void should_calculate_diff_between_dates_hours() {
        LocalDateTime first = LocalDateTime.now();
        LocalDateTime seccond = LocalDateTime.now().plusHours(24);
        Long diff = diffBetweenDates(first, seccond);
        assertEquals(Long.valueOf(86400L), diff);
    }

    @Test
    public void should_calculate_diff_between_dates_days() {
        LocalDateTime first = LocalDateTime.now();
        LocalDateTime seccond = LocalDateTime.now().plusDays(7);
        Long diff = diffBetweenDates(first, seccond);
        assertEquals(Long.valueOf(604800L), diff);
    }

    @Test
    public void should_calculate_diff_between_dates_with_diff_zero() {
        LocalDateTime first = LocalDateTime.now();
        LocalDateTime seccond = LocalDateTime.now();
        Long diff = diffBetweenDates(first, seccond);
        assertEquals(Long.valueOf(0L), diff);
    }

    @Test
    public void should_calculate_diff_between_dates_where_init_bigger_end() {
        expectation.expect(ApplicationException.class);
        expectation.expectMessage("Can not calculate difference between times where begin bigger than end");

        LocalDateTime first = LocalDateTime.now().plusMinutes(1);
        LocalDateTime seccond = LocalDateTime.now();
        diffBetweenDates(first, seccond);
    }
}
