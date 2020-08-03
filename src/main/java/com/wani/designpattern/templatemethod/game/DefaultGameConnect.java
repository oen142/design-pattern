package com.wani.designpattern.templatemethod.game;

public class DefaultGameConnect extends AbsGameConnectHelper {
    @Override
    protected String doSecurity(String str) {
        System.out.println("디코드");
        System.out.println("강화된 알고리즘");
        return str;
    }

    @Override
    protected Boolean authentication(String id, String password) {
        System.out.println("아이디/암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String username) {
        System.out.println("서버 유저 이름 가지고 나이를 확인해서 튕군다");
        System.out.println("권환 확인 과정");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계");
        return info;
    }
}
