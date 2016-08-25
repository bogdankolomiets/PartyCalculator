package com.example.bogdan.partycalculator.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.bogdan.partycalculator.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 23.08.16
 */
public class NewEventActivity extends AppCompatActivity implements MembersAdapter.NotEmptyMembersListener {
    @BindView(R.id.btnSave)
    Button btnSave;
    @BindView(R.id.rv_new_event)
    RecyclerView recyclerView;

    private MembersAdapter mAdapter;
    private LinearLayoutManager mLayoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_event_layout);
        ButterKnife.bind(this);
        mAdapter = new MembersAdapter(this);
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
    }

    @OnClick(R.id.btnAddMember)
    public void addMember() {
        mAdapter.addMember();
    }

    @Override
    public void notEmpty() {
        btnSave.setVisibility(View.VISIBLE);
    }

    @Override
    public void empty() {
        btnSave.setVisibility(View.GONE);
    }
}
