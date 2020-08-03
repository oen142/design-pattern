package com.wani.designpattern.templatemethod.main;

import com.wani.designpattern.templatemethod.game.AbsGameConnectHelper;
import com.wani.designpattern.templatemethod.game.DefaultGameConnect;

public class GameMain {
    public static void main(String[] args) {
        AbsGameConnectHelper helper = new DefaultGameConnect();
        helper.requestConnection("아이디 암호등 접속 정보");
    }
}
