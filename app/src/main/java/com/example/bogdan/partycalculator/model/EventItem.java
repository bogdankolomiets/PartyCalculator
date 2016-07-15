package com.example.bogdan.partycalculator.model;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 15.07.16
 */
public class EventItem {
  private String mName;
  private double mPay;

  public String getName() {
    return mName;
  }

  public void setName(String name) {
    mName = name;
  }

  public double getPay() {
    return mPay;
  }

  public void setPay(double pay) {
    mPay = pay;
  }
}
