package com.company;

public class HomeCat extends Cat implements Playable {
    String master;

    public HomeCat(String master,String name,String breed){
        this.master = master;
        this.name = name;
        this.breed = breed;
    }

    public void layOnSofa(){
        System.out.println("Cat lay on sofa");
    }

    public void spoilShoes(){
        System.out.println("Cat spoil shoes");
    }

    @Override
    public void playWithTail() {
        System.out.println("Home cat play with tail!");
    }

    @Override
    public void scratchEar() {
        System.out.println("Home cat scratch ear!");
    }

    @Override
    public void sleep() {
        System.out.println("Home cat sleep!");
    }
}
