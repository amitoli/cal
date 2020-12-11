package com.expedia.calender.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.expedia.calender.model.Event;

public interface EventService {

  Event createEvent(Event event);

  List<Event> getEvents(String user, LocalDate startDate, LocalDate endDate);
}
