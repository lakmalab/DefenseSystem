package com.mycompany.defensesystem;


public class DefenseSystem {

    public static void main(String[] args) {
        Observable Observable = new Observable();
        Observable.addObserver(new Helicopter());
        new MainController(Observable).setVisible(true);
    }
}
