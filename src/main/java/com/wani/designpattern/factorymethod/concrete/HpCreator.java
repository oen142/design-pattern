package com.wani.designpattern.factorymethod.concrete;

import com.wani.designpattern.factorymethod.framework.Item;
import com.wani.designpattern.factorymethod.framework.ItemCreator;

public class HpCreator extends ItemCreator {

    @Override
    protected void requestItemInformation() {
        System.out.println("데이터베이스에서 회복 물약의 정보를 가져온다.");
    }

    @Override
    protected void createItemLog() {

        System.out.println("데이터베이스에서 회복 물약의 정보 로그를 생성.");
    }

    @Override
    protected Item createItem() {

        System.out.println("HP포션 생성");
        return new HpPotion();
    }
}
