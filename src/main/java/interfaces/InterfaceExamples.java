package interfaces;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class InterfaceExamples {


    @Test
    public void interfeceInstanceExample() {
        Animal kitty = new Cat("Kitty", 2, "Orange");
        Animal labrador = new Dog("Buddy", 5, "Huge");

        Pet kitty1 = new Cat("Kitty", 2, "Orange");
        Pet labrador1 = new Dog("Buddy", 5, "Huge");
        List<Animal> animals = new ArrayList<>();
        animals.add(kitty);
        animals.add(labrador);

        animals.forEach(animal -> System.out.println(animal.getName()));
        animals.forEach(animal -> System.out.println(animal.getName()));

        List<Pet> pets = new ArrayList<>();
        pets.add(kitty1);
        pets.add(labrador1);

        pets.forEach(pet -> System.out.println(pet.isLoveChildren()));

        //But we cannot put object with type 'Animal' into list with generic 'Cat' or 'Dog' even if final implementation
        //is the same as generic
//        List<Cat> cats = new ArrayList<>();
//        cats.add(kitty);
//
//        List<Dog> dogs = new ArrayList<>();
//        dogs.add(labrador)
    }

}
