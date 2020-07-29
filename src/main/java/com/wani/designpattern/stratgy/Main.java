package com.wani.designpattern.stratgy;

public class Main {
    public static void main(String[] args) {

        //기능을 사용 통로
        AInterface aInterface = new AInterfaceImpl();
        aInterface.funcA();

        AObj aObj = new AObj();
        aObj.funcAA();
    }
}
