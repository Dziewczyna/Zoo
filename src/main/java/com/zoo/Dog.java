package com.zoo;

public class Dog extends Animal {
  private final String breed;
  private final String lengthOfDogFur;

  public Dog(String name, String breed, String lengthOfDogFur) {
    super(name);
    this.breed = breed;
    this.lengthOfDogFur = lengthOfDogFur;
  }

  @Override
  public void go() {
    System.out.println("Dog is going!");
  }

  public void makeASound() {
    System.out.println("Hau!");
  }

  public void play() {
    System.out.println("łapanie piłeczki");
  }

  @Override
  public String toString() {
    return "Wabię się "
        + name
        + ", jestem rasy "
        + breed
        + ", a mój rodzaj sierści to "
        + lengthOfDogFur;
  }
}
