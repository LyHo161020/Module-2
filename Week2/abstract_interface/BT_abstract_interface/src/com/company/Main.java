package com.company;

public class Main {

    public static void main(String[] args) {
//        Test Animal
	Animal[] animals = new Animal[3];
    animals[0] = new Dog("Bolt");
    animals[1] = new Bird("AngryBird");
    animals[2] = new Fish("Nemo");

    for (Animal animal : animals) {
        if(animal instanceof Dog){
            System.out.println(((Dog) animal).makeSound());
            System.out.println(((Dog) animal).run());
        } else if (animal instanceof Fish) {
            System.out.println(((Fish) animal).swim());
        }else {
            System.out.println(((Bird) animal).fly());
        }
    }


//      Test Machine
    Machine[] machines = new Machine[2];
    machines[0] = new Car("McQueen");
    machines[1] = new Planes("Siddeley");

    for (Machine machine : machines){
        if(machine instanceof Car){
            System.out.println(((Car) machine).run());
        }else {
            System.out.println(((Planes) machine).fly());
        }
    }
    }
}
