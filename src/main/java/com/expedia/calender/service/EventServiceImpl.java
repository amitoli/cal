package com.expedia.calender.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expedia.calender.dao.EventRepository;
import com.expedia.calender.model.Event;

@Service
public class EventServiceImpl implements EventService
{
	private EventRepository eventRepository;

	@Autowired
	public EventServiceImpl(EventRepository eventRepository)
	{
		this.eventRepository = eventRepository;
	}

	@Transactional
	public Event createEvent(Event event){

		return eventRepository.save(event);

	}

	@Override public List<Event> getEvents(String user, LocalDateTime startDate, LocalDateTime endDate)
	{

		return eventRepository.getEvent(user,startDate,endDate);
	}
}
