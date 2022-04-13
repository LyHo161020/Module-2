package com.company;

public class Bird extends Animal implements Flyable{
    public Bird(){
    }

    public Bird(String name){
        super(name);
    }

    @Override
    public String fly() {
        return getName() + " đang bay!";
    }
}
