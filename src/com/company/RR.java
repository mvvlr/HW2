package com.company;

public class RR extends Moto {
    private int horsePower;

    public RR(String type, int age) {
        super(type, age);
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }
    @Override
    public void print() {
    super.print();
        System.out.println(" age = :2000 ");
    }
}
