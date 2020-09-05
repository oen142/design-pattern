package com.wani.designpattern.observer;

public class Application {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(button1 -> System.out.println("button = " + button1 + " is clicked"));
        button.onClick();
    }
}


class ButtonClick implements Button.OnClickListener{

    @Override
    public void onClick(Button button) {
        System.out.println(button + " is Clicked");
    }
}