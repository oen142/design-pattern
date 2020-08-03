package com.wani.designpattern.factorymethod.concrete;

import com.wani.designpattern.factorymethod.framework.Item;

public class MpPotion implements Item {
    @Override
    public void use() {
        System.out.println("마력 회복");
    }
}
