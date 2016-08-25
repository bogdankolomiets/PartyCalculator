package com.example.bogdan.partycalculator.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.bogdan.partycalculator.App;
import com.example.bogdan.partycalculator.presenter.MainPresenter;
import com.example.bogdan.partycalculator.R;
import com.example.bogdan.partycalculator.di.MainViewModule;
import com.example.bogdan.partycalculator.entity.Event;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 19.08.16
 */
public class MainActivity extends AppCompatActivity implements MainView {
    @BindView(R.id.rv_main)
    RecyclerView recyclerView;

    @Inject
    MainPresenter presenter;

    private Toolbar mToolbar;
    private EventsAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        ButterKnife.bind(this);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        App.get(this).getAppComponent().plus(new MainViewModule(this)).inject(this);
        mAdapter = new EventsAdapter();
        LinearLayoutManager llManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llManager);
        recyclerView.setAdapter(mAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @OnClick(R.id.fabAddEvent)
    public void newEvent() {
        startActivity(new Intent(this, NewEventActivity.class));
    }

    @Override
    public void showEvents(List<Event> events) {
        mAdapter.addEvents(events);
    }

    @Override
    public void addNewEvent() {

    }

}
