package com.wani.designpattern.strategy;

public class AObj {

    AInterface aInterface;
    public AObj(){
        aInterface = new AInterfaceImpl();
    }
    /*
    * 훨씬 복잡하다
    * ~ 기능이 필요합니다. 개발해주세요.
    *
    *  C , D ...
    * */
    public void funcAA(){
        /*
        * 위임 한다.
        * */
        aInterface.funcA();
        aInterface.funcA();

    }

}
