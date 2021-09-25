package com.company;

public class Кошка extends Животное {

    public Кошка(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected int ограничениеПоПлаванию() {
        return 0;
    }

    @Override
    protected int ограничениеПоБегу() {
        return 200;
    }

    @Override
    protected boolean умеетПлавать() {
        return false;
    }
}
