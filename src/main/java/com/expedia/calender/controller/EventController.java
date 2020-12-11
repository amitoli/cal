package com.expedia.calender.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.expedia.calender.model.Event;
import com.expedia.calender.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/event")
public class EventController {

  EventService eventService;

  @Autowired
  public EventController(EventService eventService) {
    this.eventService = eventService;
  }

  @PostMapping
  public ResponseEntity<Event> createEvent(@RequestBody Event event) {
    Event eventCreated = eventService.createEvent(event);
    return ResponseEntity.status(HttpStatus.CREATED).body(eventCreated);
  }

  @DeleteMapping
  public ResponseEntity<Void> deleteEvent(@RequestParam("id") int eventId) {
    //eventService.deleteEvent(eventId);
    return ResponseEntity.status(HttpStatus.OK).build();
  }

  @GetMapping
  public ResponseEntity<List<Event>> getEvents(@RequestParam String user, LocalDate startDate,
      LocalDate endDate) {
    List<Event> event = eventService.getEvents(user, startDate, endDate);
    return ResponseEntity.status(HttpStatus.OK).body(event);
  }

}
