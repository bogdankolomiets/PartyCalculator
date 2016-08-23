package com.example.bogdan.partycalculator.ui;

import com.example.bogdan.partycalculator.entity.Event;

import java.util.List;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 19.08.16
 */
public interface MainView {
    void showEvents(List<Event> events);
    void addNewEvent();
}
