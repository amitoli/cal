package com.expedia.calender.dao;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.expedia.calender.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event,Long>//why long?
{
	@Query(value = "")
	public void getEvent(String user, LocalDateTime startDate, LocalDateTime endDate){

	}
}
