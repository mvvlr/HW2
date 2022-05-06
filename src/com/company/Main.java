package com.company;

public class Main {

    public static void main(String[] args) {
        Printable[] print = {createObject("obj1") , createObject("obj2"),createObject("obj3")

        };
        for (Printable printable :print){
            printable.print();

        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "obj1":
                Ninja ninja = new Ninja("Super", 6);
                return ninja;
            case "obj2":
                Hayabusa hayabusa = new Hayabusa("relaxed", 12);
                return hayabusa;
            case "obj3":
                RR rr = new RR("Sport", 8);
                return rr;
        }
    return null;
    }


}
