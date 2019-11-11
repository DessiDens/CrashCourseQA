package com.company;

public class WildCat extends Cat implements Playable {

    public WildCat(String name,String breed){
        this.name = name;
        this.breed = breed;
    }

    public void hatePeople(){
        System.out.println("Cat hate people");
    }

    @Override
    public void playWithTail() {
        System.out.println("Wild cat play with tail");
    }

    @Override
    public void scratchEar() {
        System.out.println("Wild cat scratch ear");
    }

    @Override
    public void sleep() {
        System.out.println("Wild cat sleep");
    }
}
