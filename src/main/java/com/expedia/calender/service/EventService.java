package com.expedia.calender.service;

import java.time.LocalDateTime;

import com.expedia.calender.model.Event;

public interface EventService
{
	Event createEvent(Event event);
	Event getEvent(String user, LocalDateTime startDate, LocalDateTime endDate);
}
