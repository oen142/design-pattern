package com.wani.designpattern.singleton;

public class SingletonSpeaker {
    public static void main(String[] args) {
        SystemSpeaker systemSpeaker1 = SystemSpeaker.getInstance();
        SystemSpeaker systemSpeaker2 = SystemSpeaker.getInstance();

        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());
        systemSpeaker1.setVolume(10);
        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());
    }
}
