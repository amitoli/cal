package service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EventRepository;
import model.Event;
import model.request.EventRequestType;

@Service
public class EventService implements IEventService
{
	private EventRepository eventRepository;

	@Autowired
	public EventService(EventRepository eventRepository)
	{
		this.eventRepository = eventRepository;
	}

	@Transactional
	public void createEvent(EventRequestType eventRequestType){
		Event event = new Event();
		event.setStartTime(eventRequestType.getStartTime());
		event.setEndTime(eventRequestType.getEndTime());
		event.setTitle(eventRequestType.getTitle());
		eventRepository.save(event);

	}
}
