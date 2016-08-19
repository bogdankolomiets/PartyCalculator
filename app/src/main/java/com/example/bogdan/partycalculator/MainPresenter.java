package com.example.bogdan.partycalculator;

import com.example.bogdan.partycalculator.manager.DatabaseManagerImpl;

import javax.inject.Inject;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 19.08.16
 */
public class MainPresenter {
    private final MainView mView;
    private final DatabaseManagerImpl mDatabaseManager;

    @Inject
    public MainPresenter(MainView view, DatabaseManagerImpl databaseManager) {
        mView = view;
        mDatabaseManager = databaseManager;
    }

    public void onResume() {
        mView.showEvents(mDatabaseManager.getEvents());
    }
}
