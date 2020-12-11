package com.expedia.calender.service;

import com.expedia.calender.model.Event;
import java.time.LocalDate;
import java.util.List;

public interface EventService {

  Event createEvent(Event event);

  List<Event> getEvents(String user, LocalDate startDate, LocalDate endDate);
}
