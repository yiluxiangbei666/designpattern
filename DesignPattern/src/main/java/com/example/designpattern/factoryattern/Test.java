package com.example.designpattern.factoryattern;

public class Test {
    public static void main(String[] args) {
        PlasticChair plasticChair=new PlasticChair();
        WoodenDesk woodenDesk=new WoodenDesk();
        SomeFurnitureFactory someFurnitureFactory = new SomeFurnitureFactory(woodenDesk,plasticChair);
        System.out.println(someFurnitureFactory.createChair().getType());
        System.out.println(someFurnitureFactory.createDesk().getType());
        System.out.println("sdadas");
    }
}
