package com.wani.designpattern.factorymethod.concrete;

import com.wani.designpattern.factorymethod.framework.Item;

public class HpPotion implements Item {

    @Override
    public void use() {
        System.out.println("체력 회복");
    }
}
