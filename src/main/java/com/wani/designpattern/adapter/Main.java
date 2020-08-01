package com.wani.designpattern.adapter;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();
        Float aFloat = adapter.twiceOf(100f);
        Float aFloat1 = adapter.halfOf(88f);

        System.out.println("aFloat1 = " + aFloat);
        System.out.println("aFloat1 = " + aFloat1);
    }
}
