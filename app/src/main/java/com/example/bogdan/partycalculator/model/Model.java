package com.example.bogdan.partycalculator.model;

import com.example.bogdan.partycalculator.entity.Event;
import com.example.bogdan.partycalculator.manager.DatabaseManager;
import com.example.bogdan.partycalculator.manager.DatabaseManagerImpl;

import java.util.List;

import javax.inject.Inject;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 19.08.16
 */
public class Model {
    private final DatabaseManager mDatabaseManager;

    @Inject
    public Model(DatabaseManagerImpl databaseManager) {
        mDatabaseManager = databaseManager;
    }

    public List<Event> getEvents() {
        return mDatabaseManager.getEvents();
    }
}
