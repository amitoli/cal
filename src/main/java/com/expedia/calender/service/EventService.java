package com.expedia.calender.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expedia.calender.dao.EventRepository;
import com.expedia.calender.model.Event;

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
	public void createEvent(Event event){

		eventRepository.save(event);

	}
}
