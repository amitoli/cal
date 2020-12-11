package com.expedia.calender.controller;

import java.time.LocalDateTime;

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
public class EventController
{
	EventService eventService;

	@Autowired
	public EventController(EventService eventService){
		this.eventService = eventService;
	}

	@PostMapping
	public ResponseEntity<Event> createEvent(@RequestBody Event event){
		Event eventCreated = eventService.createEvent(event);
		return ResponseEntity.status(HttpStatus.CREATED).body(eventCreated);
	}

	@DeleteMapping
	public ResponseEntity<Void> deleteEvent(@RequestParam("id") int eventId){
		//eventService.deleteEvent(eventId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@GetMapping
	public ResponseEntity<Event> getEvent(@RequestParam String user, LocalDateTime startDate, LocalDateTime endDate){
		Event event = eventService.getEvent(user,startDate,endDate);
		return ResponseEntity.status(HttpStatus.OK).body(event);
	}

}
