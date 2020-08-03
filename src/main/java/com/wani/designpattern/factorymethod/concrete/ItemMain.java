package com.wani.designpattern.factorymethod.concrete;

import com.wani.designpattern.factorymethod.framework.Item;
import com.wani.designpattern.factorymethod.framework.ItemCreator;

public class ItemMain {
    public static void main(String[] args) {
        ItemCreator creator  = new HpCreator();
        Item item =  creator.create();
        item.use();
        creator = new MpCreator();
        creator.create();
    }
}
