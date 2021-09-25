package com.company;

public abstract class Животное {

    protected String name;

    protected abstract int ограничениеПоПлаванию();

    protected abstract int ограничениеПоБегу();

    protected abstract boolean умеетПлавать();

    public void бежать(int длина) {
        if (длина >= 0) {
            if (длина <= ограничениеПоБегу()) {
                System.out.println(this.name + " пробежал " + длина + " м.");
            } else {
                System.out.println(this.name + " пробежал " + ограничениеПоБегу() + " из " + длина + " м и сдох.");
            }
        } else {
            System.out.println(this.name + " говорит, что бег назад не в приоритете");
        }
    }

    public void плыть(int длина) {
        if (умеетПлавать()) {
            if (длина >= 0) {
                if (длина <= ограничениеПоПлаванию()) {
                    System.out.println(this.name + " проплыл " + длина + " м.");
                } else {
                    System.out.println(this.name + " проплыл " + ограничениеПоПлаванию() + " из " + длина + " м и утонул.");
                }
            } else {
                System.out.println(this.name + " говорит, что плавание назад не в приоритете");
            }
        } else {
            System.out.println(this.name + " УТОНУЛ");
        }
    }

}
