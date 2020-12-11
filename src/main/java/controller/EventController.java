package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.request.EventRequestType;
import service.IEventService;

@RestController
@RequestMapping(value = "/event")
public class EventController
{
	IEventService eventService;

	@Autowired
	public EventController(IEventService eventService){
		this.eventService = eventService;
	}

	@PostMapping(value = "/createEvent",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createEvent(@RequestBody EventRequestType eventRequestType){
		eventService.createEvent(eventRequestType);
		return "200";
	}


}
