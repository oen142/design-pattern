package com.wani.designpattern.stratgyegame;

public class Game {
    public static void main(String[] args) {
        Character character = new Character();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Ax());
        character.attack();
    }
}
