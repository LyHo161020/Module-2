package com.company;

public class Fish extends Animal implements Swimalbe {
    public Fish(){
    }

    public Fish(String name){
        super(name);
    }

    @Override
    public String swim() {
        return getName() + " đang bơi!";
    }
}
