package com.example.bogdan.partycalculator.di;

import com.example.bogdan.partycalculator.ui.MainActivity;

import dagger.Subcomponent;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 19.08.16
 */
@Subcomponent(modules = {MainViewModule.class})
public interface MainViewComponent {

    void inject(MainActivity mainActivity);
}
