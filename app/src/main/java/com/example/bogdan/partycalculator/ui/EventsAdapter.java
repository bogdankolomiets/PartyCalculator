package com.example.bogdan.partycalculator.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bogdan.partycalculator.R;
import com.example.bogdan.partycalculator.entity.Event;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 19.08.16
 */
public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.Holder> {
    private List<Event> mEvents;

    public EventsAdapter() {
        mEvents = new ArrayList<>();
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.event_item, parent, false));
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Event event = mEvents.get(position);

        holder.tvName.setText(event.getName());
        holder.tvEventDate.setText(event.getDate());
        holder.tvEventBudget.setText(String.valueOf(event.getBudget()));
        holder.tvMembersCount.setText(String .valueOf(event.getMembersCount()));
    }

    @Override
    public int getItemCount() {
        return mEvents.size();
    }

    public void addEvents(List<Event> events) {
        mEvents.addAll(events);
        notifyDataSetChanged();
    }

    class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_event_name)
        TextView tvName;
        @BindView(R.id.tv_event_date)
        TextView tvEventDate;
        @BindView(R.id.tv_event_members_count)
        TextView tvMembersCount;
        @BindView(R.id.tv_event_budget)
        TextView tvEventBudget;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
