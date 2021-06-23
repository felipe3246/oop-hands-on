package com.poc.poo.polymorphism.overloding;

public class Snake extends Animal {
    public void numberOfPaws(int paws, String name){
        System.out.println("This animal has " + Integer.toString(paws) + "paws, his name is " + name + ", and remember, the life snake !");
    }
}
