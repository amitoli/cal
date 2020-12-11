package model.request;

import java.time.LocalDateTime;

public class EventRequestType
{
	String title;
	LocalDateTime startTime;
	LocalDateTime endTime;
	String location;
	String owner;

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public LocalDateTime getStartTime()
	{
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime)
	{
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime()
	{
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime)
	{
		this.endTime = endTime;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public String getOwner()
	{
		return owner;
	}

	public void setOwner(String owner)
	{
		this.owner = owner;
	}
}
