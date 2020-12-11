package com.expedia.calender.dao;

import com.expedia.calender.model.Event;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer>//Datatype of
{

  @Query(value = "SELECT E FROM Event E WHERE E.user = :user AND E.startTime >= :startDate AND E.endTime < :endDate ")
  List<Event> getEvent(@Param("user") String user, @Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);
}
