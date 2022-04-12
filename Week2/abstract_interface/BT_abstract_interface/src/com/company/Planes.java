package com.company;

public class Siddeley extends Machine implements Flyable{
    public Siddeley(){
    }

    public Siddeley(String name){
        super(name);
    }
    @Override
    public String fly() {
        return getName() + " đang bay!";
    }
}
