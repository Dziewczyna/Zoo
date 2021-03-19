package com.zoo.hen;

import java.util.List;

public class EggCounter extends Hen {
  private int eggCounter = 0;

  public EggCounter(String name, String colour, String breed) {
    super(name, colour, breed);
  }

  @Override
  public String layEgg() {
    eggCounter += 1;
    return super.layEgg();
  }

  @Override
  public List<String> layEggs(int nrOfEggs) {
    eggCounter += nrOfEggs;
    return super.layEggs(nrOfEggs);
  }

  public int getEggCounter() {
    return eggCounter;
  }
}
