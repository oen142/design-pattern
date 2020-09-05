package com.wani.designpattern.observer3;

public interface Observable {
    void subscribe(Observer o);
    void unSubscribe(Observer o);
    void chatToPeople();
}
