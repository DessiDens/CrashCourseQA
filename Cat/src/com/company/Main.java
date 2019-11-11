package com.company;

public class Main {

    public static void main(String[] args) {
       Cat[]  cats = new Cat[4];
        cats[0] = new HomeCat("Allan Wake","Bella","Maine coon");
        cats[1] = new HomeCat("Tom Redl","Beeper","Sphinx");
        cats[2] = new WildCat("Andy","No breed");
        cats[3] = new WildCat("Luna","Turkish angora");
        for (int i=0;i<4;i++){
            System.out.println("Cat name - "+ cats[i].name + "\nBreed - " + cats[i].breed + "\n");
        }
    }
}
