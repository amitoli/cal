package com.expedia.calender.service.impl;

import com.expedia.calender.service.EventService;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expedia.calender.dao.EventRepository;
import com.expedia.calender.model.Event;

@Service
public class EventServiceImpl implements EventService {

  private EventRepository eventRepository;

  @Autowired
  public EventServiceImpl(EventRepository eventRepository) {
    this.eventRepository = eventRepository;
  }

  @Transactional
  public Event createEvent(Event event) {

    return eventRepository.save(event);

  }

  @Override
  public List<Event> getEvents(String user, LocalDate startDate, LocalDate endDate) {
    LocalDateTime startDateTime = startDate.atStartOfDay();
    LocalDateTime endDateTime = endDate.plus(1L, ChronoUnit.DAYS).atStartOfDay();
    return eventRepository.getEvent(user, startDateTime, endDateTime);
  }
}
