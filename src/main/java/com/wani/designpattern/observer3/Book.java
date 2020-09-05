package com.wani.designpattern.observer3;


import java.util.ArrayList;
import java.util.List;

public class Book implements Observable {


    List<Observer> observerList = new ArrayList<>();
    private boolean isNewContents;



    public boolean isNewContents() {
        return isNewContents;
    }

    public void setNewContents() {
        System.out.println("신규 컨텐츠가 등록 되었습니다.");
        isNewContents = true;
        chatToPeople();
    }

    @Override
    public void subscribe(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unSubscribe(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void chatToPeople() {
        observerList.forEach(Observer::update);
    }
}
