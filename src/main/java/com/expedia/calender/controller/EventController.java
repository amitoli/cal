package com.expedia.calender.controller;

import com.expedia.calender.model.Event;
import com.expedia.calender.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/event")
public class EventController
{
	IEventService eventService;

	@Autowired
	public EventController(IEventService eventService){
		this.eventService = eventService;
	}

	@PostMapping
	public ResponseEntity<Event> createEvent(@RequestBody Event event){
		Event eventCreated = eventService.createEvent(event);
		return ResponseEntity.status(HttpStatus.CREATED).body(eventCreated);
	}

	@DeleteMapping
	public ResponseEntity<Void> deleteEvent(@RequestParam int eventId){
		//eventService.deleteEvent(eventId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

}
