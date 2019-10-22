package com.flavia_api.calendar;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventAttendee;
import com.google.api.services.calendar.model.EventDateTime;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class GoogleCalendar {

	public static void Calendar(HttpTransport httpTransport, JsonFactory jsonFactory, HttpRequestInitializer credentials) {

		try {

			// Initialize Calendar service with valid OAuth credentials credentials

			Calendar service = new Calendar.Builder(httpTransport, jsonFactory, credentials)
					.setApplicationName("applicationName").build();

			// Create and initialize a new event (could also retrieve an existing event)
			Event event = new Event();
			event.setICalUID("originalUID");

			Event.Organizer organizer = new Event.Organizer();
			organizer.setEmail("organizerEmail");
			organizer.setDisplayName("organizerDisplayName");
			event.setOrganizer(organizer);

			ArrayList<EventAttendee> attendees = new ArrayList<EventAttendee>();
			attendees.add(new EventAttendee().setEmail("attendeeEmail"));
			// ...
			event.setAttendees(attendees);

			Date startDate = new Date();
			Date endDate = new Date(startDate.getTime() + 3600000);
			DateTime start = new DateTime(startDate, TimeZone.getTimeZone("UTC"));
			event.setStart(new EventDateTime().setDateTime(start));
			DateTime end = new DateTime(endDate, TimeZone.getTimeZone("UTC"));
			event.setEnd(new EventDateTime().setDateTime(end));

			// Import the event into a calendar
			Event importedEvent = service.events().calendarImport("primary", event).execute();
			System.out.println(importedEvent.getId());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
