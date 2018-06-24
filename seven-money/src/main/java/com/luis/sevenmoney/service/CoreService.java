package com.luis.sevenmoney.service;

import com.luis.sevenmoney.domain.TimePunche;
import com.luis.sevenmoney.domain.User;
import com.luis.sevenmoney.service.util.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class CoreService {

    @Autowired
    private LocationService locationService;

    @Autowired
    private UserService userService;

    @Autowired
    private TimePunchesService timePunchesService;

    public TreeMap<Boolean, List<TimePunche>> splitInWeekends(List<TimePunche> timePunchesServices) {
        TreeMap<Boolean, List<TimePunche>> booleanListTreeMap = new TreeMap<>();

        List<TimePunche> timeWeekDays = new ArrayList<>();
        List<TimePunche> timeWeekendDays = new ArrayList<>();

        return null;
    }

    public List<TimePunche> splitIfNewDay(TimePunche timePunche) {
        if (!isSameDayInAndOut(timePunche)) {
            //I dont like inline comment, but for explain:
            //It will make that {in-> 22:00 out -> 01:00}, become: {in-> 22:00 out -> 23:59} and {in-> 00:00 out -> 01:00}
            timePunche.setClockedOut(DateService.createTodayAtNight(timePunche.getClockedIn()));
            TimePunche newtime = cloneObject(timePunche);
            newtime.setClockedIn(DateService.createTomorrowAtMorning(timePunche.getClockedOut()));
            return Arrays.asList(timePunche, newtime);
        }
        return Arrays.asList(timePunche);
    }

    public Boolean isSameDayInAndOut(TimePunche timePunche) {
        return timePunche.getClockedIn().getDayOfMonth() == timePunche.getClockedOut().getDayOfMonth();
    }

    public List<TimePunche> splitWeekDays(List<TimePunche> timePunche, Boolean weekend) {
        return timePunche
                .stream()
                .filter(time -> {
                    DayOfWeek day = time.getClockedIn().getDayOfWeek();
                    if (weekend) {
                        return weekend.equals(DateService.isWeekend(day));
                    }
                    return !weekend.equals(DateService.isWeekend(day));
                }).collect(Collectors.toList());
    }

    private TimePunche cloneObject(TimePunche timePunche) {
        return new TimePunche()
                .setModified(timePunche.getModified())
                .setHourlyWage(timePunche.getHourlyWage())
                .setClockedOut(timePunche.getClockedOut())
                .setClockedIn(timePunche.getClockedIn())
                .setLocationId(timePunche.getLocationId())
                .setId(timePunche.getId())
                .setUserId(timePunche.getUserId());
    }

}
