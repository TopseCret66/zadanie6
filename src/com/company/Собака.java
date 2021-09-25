package com.company;

public class Собака extends Животное {

    public Собака(String name) {
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
        return 10;
    }

    @Override
    protected int ограничениеПоБегу() {
        return 500;
    }

    @Override
    protected boolean умеетПлавать() {
        return true;
    }
}
