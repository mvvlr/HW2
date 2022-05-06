package com.company;

public class Hayabusa extends Moto {
private int maxSpeed;

    public Hayabusa(String type, int age) {
        super(type, age);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    @Override
    public void print() {
    super.print();
        System.out.println(" age = :2005 ");
    }
}
