package com.wani.designpattern.ovserver2;

import java.util.Observable;

public class Button extends Observable {

    void onClick(){
        setChanged();
        notifyObservers();
    }
}
