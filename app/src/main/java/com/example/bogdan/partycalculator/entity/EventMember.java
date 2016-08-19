package com.example.bogdan.partycalculator.entity;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 19.08.16
 */
public class EventMember {
    private String mName;
    private double mMoney;

    public EventMember(String name, double money) {
        mName = name;
        mMoney = money;
    }

    public String getName() {
        return mName;
    }

    public double getMoney() {
        return mMoney;
    }
}
