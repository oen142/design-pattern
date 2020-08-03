package com.wani.designpattern.factorymethod.framework;

public abstract class ItemCreator {
    public Item create(){
        Item item ;
        requestItemInformation();
        item = createItem();
        createItemLog();
        return item;
    }

    //아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청한다.
    abstract protected void requestItemInformation();
    //아이템 로그 생성
    abstract protected void createItemLog();
    //아이템 생성
    abstract protected Item createItem();
}
