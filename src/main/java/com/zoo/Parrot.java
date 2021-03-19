package com.zoo;

public class Parrot extends Animal {
  private final String colour;
  private final String breed;

  public Parrot(String name, String colour, String breed) {
    super(name);
    this.colour = colour;
    this.breed = breed;
  }

  @Override
  public void go() {
    System.out.println("Parrot is flying!");
  }

  public void makeASound() {
    System.out.println("Dzień dobry!");
  }

  public void play() {
    System.out.println("Chodzenie i mówienie");
  }

  @Override
  public String toString() {
    return "Wabię się "
        + name
        + ", kolor mojego upierzenia to "
        + colour
        + ", jestem rasy "
        + breed;
  }
}
