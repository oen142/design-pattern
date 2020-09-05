package com.wani.designpattern.observer3;

public class Application {
    public static void main(String[] args) {
        Book book = new Book();

        Observer observer1 = new Lion();
        Observer observer2 = new Mooji();

        book.subscribe(observer1);
        book.subscribe(observer2);


        book.setNewContents();

        book.unSubscribe(observer1);

        book.setNewContents();
    }
}
