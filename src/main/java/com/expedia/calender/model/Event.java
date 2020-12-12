package com.expedia.calender.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Event {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  String title;
  LocalDateTime startTime;
  LocalDateTime endTime;
  String location;
  String user;

  @Enumerated(EnumType.STRING)
  EventType eventType;
}
