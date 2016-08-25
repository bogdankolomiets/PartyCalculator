package com.example.bogdan.partycalculator.presenter;

import com.example.bogdan.partycalculator.entity.Event;
import com.example.bogdan.partycalculator.model.Model;
import com.example.bogdan.partycalculator.ui.MainView;

import java.util.List;

import javax.inject.Inject;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 19.08.16
 */
public class MainPresenter {
    private final MainView mView;
    private final Model mModel;

    @Inject
    public MainPresenter(MainView view, Model model) {
        mView = view;
        mModel = model;
    }

    public void onResume() {
        List<Event> events = mModel.getEvents();
        mView.showEvents(mModel.getEvents());
    }
}
