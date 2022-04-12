package com.company;

public class McQueen extends Machine implements Runnable{
    public McQueen(){
    }

    public McQueen(String name){
        super(name);
    }
    @Override
    public String run() {
        return getName() + " đang chạy!";
    }
}
