package com.expedia.calender.dao;

import com.expedia.calender.model.Event;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer>//Datatype of
{

  @Query(value = "SELECT * FROM EVENT WHERE USER ")
  public List<Event> getEvent(String user, LocalDateTime startDate, LocalDateTime endDate);
}
