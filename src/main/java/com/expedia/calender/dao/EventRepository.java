package com.expedia.calender.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expedia.calender.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event,Long>
{

}
