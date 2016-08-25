package com.example.bogdan.partycalculator.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.bogdan.partycalculator.R;
import com.example.bogdan.partycalculator.entity.EventMember;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 23.08.16
 */
public class MembersAdapter extends RecyclerView.Adapter<MembersAdapter.Holder> {
    private List<EventMember> mMembers;
    private NotEmptyMembersListener mListener;

    public MembersAdapter(NotEmptyMembersListener listener) {
        mListener = listener;
        mMembers = new ArrayList<>();
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.new_event_item, parent, false));
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        if (mMembers.size() == 0) {
            mListener.empty();
        } else {
            mListener.notEmpty();
        }
        EventMember eventMember = mMembers.get(position);

        holder.etName.setText(eventMember.getName());
        holder.etMoney.setText(eventMember.getMoney() != 0.0 ? String.valueOf(eventMember.getMoney()) : null);
    }

    @Override
    public int getItemCount() {
        return mMembers.size();
    }

    public void addMember() {
        mMembers.add(new EventMember());
        notifyDataSetChanged();
    }

    class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.et_name)
        EditText etName;
        @BindView(R.id.et_money)
        EditText etMoney;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public interface NotEmptyMembersListener {
        void notEmpty();
        void empty();
    }
}
