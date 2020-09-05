package com.wani.designpattern.observer3;

public class Lion implements Observer {
    @Override
    public void update() {
        System.out.println("라이언 : 책끝을 접다.");
    }
}
