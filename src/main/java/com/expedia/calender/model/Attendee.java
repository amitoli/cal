package com.expedia.calender.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Attendee
{
	String name;
	String email;
}
