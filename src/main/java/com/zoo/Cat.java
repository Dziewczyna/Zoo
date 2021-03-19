package com.zoo;

public class Cat extends Animal {
  private final String colour;
  private final String breed;

  public Cat(String name, String colour, String breed) {
    super(name);
    this.colour = colour;
    this.breed = breed;
  }

  @Override
  public void go() {
    System.out.println("Cat is going!");
  }

  public void makeASound() {
    System.out.println("Miau!");
  }

  public void play() {
    System.out.println("Drapanie drapaka i fukanie na gości");
  }

  @Override
  public String toString() {
    return "Wabię się " + name + ", mój kolor futerka to " + colour + ", jestem rasy " + breed;
  }
}
