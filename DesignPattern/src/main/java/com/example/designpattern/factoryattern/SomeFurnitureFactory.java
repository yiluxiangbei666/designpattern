package com.example.designpattern.factoryattern;

public class SomeFurnitureFactory implements FurnitureFactory{
    private Desk desk;
    private Chair chair;
    public SomeFurnitureFactory(Desk desk, Chair chair){
        this.desk=desk;
        this.chair=chair;
    }
    @Override
    public Desk createDesk() {
        return desk;
    }

    @Override
    public Chair createChair() {
        return chair;
    }
}
