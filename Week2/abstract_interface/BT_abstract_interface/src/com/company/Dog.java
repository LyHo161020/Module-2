package com.company;

public class Dog extends Animal implements Runnable, Barkalbe{

    public Dog(){
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String run() {
        return getName() + " đang chạy!";
    }

    @Override
    public String makeSound() {
        return getName() +  " sủa gâu gâu!";
    }
}
