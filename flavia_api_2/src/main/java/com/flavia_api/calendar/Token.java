package com.flavia_api.calendar;

import java.io.IOException;
import java.util.List;

import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.model.CalendarList;
import com.google.api.services.calendar.model.CalendarListEntry;

public class Token {

	public static void PegarToken(HttpTransport httpTransport, JsonFactory jsonFactory, HttpRequestInitializer credentials) {

		try {
			// Initialize Calendar service with valid OAuth credentials
			Calendar service = new Calendar.Builder(httpTransport, jsonFactory, credentials)
					.setApplicationName("applicationName").build();

			// Iterate through entries in calendar list
			String pageToken = null;
			do {
				CalendarList calendarList = service.calendarList().list().setPageToken(pageToken).execute();
				List<CalendarListEntry> items = calendarList.getItems();

				for (CalendarListEntry calendarListEntry : items) {
					System.out.println(calendarListEntry.getSummary());
				}
				
				pageToken = calendarList.getNextPageToken();
				
			} while (pageToken != null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
