package com.poc.poo.polymorphism.overloding;

public class Cat extends Animal {
    public void numberOfPaws(int paws, int numLives){
        System.out.println("This animal has " + Integer.toString(paws) + "paws, and has " + Integer.toString(numLives) + "lives!");
    }
}
