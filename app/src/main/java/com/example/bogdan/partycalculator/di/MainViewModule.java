package com.example.bogdan.partycalculator.di;

import com.example.bogdan.partycalculator.MainPresenter;
import com.example.bogdan.partycalculator.ui.MainView;
import com.example.bogdan.partycalculator.model.Model;

import dagger.Module;
import dagger.Provides;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 19.08.16
 */
@Module
public class MainViewModule {
    private MainView mView;

    public MainViewModule(MainView view) {
        mView = view;
    }

    @Provides
    MainPresenter providePresenter(Model model) {
        return new MainPresenter(mView, model);
    }
}
