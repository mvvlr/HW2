package com.company;

public class Ninja extends Moto{
private double wheelSize;


    public Ninja(String type, int age) {
        super(type, age);
    }

    public double getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(double wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Ninja(String type, int age, double wheelSize) {
        super(type, age);
        this.wheelSize = wheelSize;
    }
    @Override
    public void print() {
    super.print();
        System.out.println(" age = :2007");
    }


    }

