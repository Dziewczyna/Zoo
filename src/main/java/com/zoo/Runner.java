package com.zoo;

import java.util.ArrayList;
import java.util.List;

public class Runner {
  public static void main(String[] args) {
    Cat cat = new Cat("IdźStąd", "szary", "dachowiec");
    cat.go();

    Dog dog = new Dog("Bailey", "Owczarek Podhalański", "średnia");
    dog.go();

    Parrot parrot = new Parrot("Felix", "kolorowy", "falista");
    parrot.go();

    List<Animal> object = new ArrayList<>();
    object.add(cat);
    object.add(dog);
    object.add(parrot);
    for (Animal animal : object) {
      System.out.println(animal);
      animal.go();
    }
  }
}
