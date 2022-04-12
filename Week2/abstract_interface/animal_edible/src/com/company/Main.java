package com.company;

public class Main {

    public static void main(String[] args) {
//	    Test Tiger and Chicken
        Animal[] animals = new Animal[2];
        animals[0]  = new Tiger();
        animals[1]  = new Chicken();

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                System.out.println(((Chicken) animal).howToEat());
            }
        }

//      Test Fruit

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
