package com.example.bogdan.partycalculator.di;

import dagger.Component;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 19.08.16
 */
@Component(modules = {AppModule.class})
public interface AppComponent {

    MainViewComponent plus(MainViewModule mainViewModule);
}
