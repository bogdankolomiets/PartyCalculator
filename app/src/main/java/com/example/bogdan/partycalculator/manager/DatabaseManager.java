package com.example.bogdan.partycalculator.manager;

import com.example.bogdan.partycalculator.entity.Event;

import java.util.List;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 19.08.16
 */
public interface DatabaseManager {
    void addEvent(Event event);
    List<Event> getEvents();
    Event getEventById(String id);
}
