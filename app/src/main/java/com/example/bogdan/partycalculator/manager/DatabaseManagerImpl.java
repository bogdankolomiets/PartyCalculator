package com.example.bogdan.partycalculator.manager;

import com.example.bogdan.partycalculator.entity.Event;
import com.example.bogdan.partycalculator.manager.DatabaseManager;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 19.08.16
 */
public class DatabaseManagerImpl implements DatabaseManager {
    private final List<Event> mEvents;

    @Inject
    public DatabaseManagerImpl() {
        mEvents = new ArrayList<>();
    }

    @Override
    public void addEvent(Event event) {
        mEvents.add(event);
    }

    @Override
    public List<Event> getEvents() {
        return mEvents;
    }

    @Override
    public Event getEventById(String id) {
        for (Event event : mEvents) {
            if (event.getId().equals(id)) {
                return event;
            }
        }

        return null;
    }
}
