package com.example.bogdan.partycalculator.entity;

import com.example.bogdan.partycalculator.entity.EventMember;

import java.util.List;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 19.08.16
 */
public class Event {
    private String mId;
    private String mName;
    private String mDate;
    private List<EventMember> mMembers;

    public Event() {

    }

    public String getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getDate() {
        return mDate;
    }

    public List<EventMember> getMembers() {
        return mMembers;
    }
}
