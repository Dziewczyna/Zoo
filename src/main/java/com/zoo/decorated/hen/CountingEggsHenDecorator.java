package com.zoo.decorated.hen;

import java.util.List;

public class CountingEggsHenDecorator extends Hen {
  private Hen hen;
  private int counter;

  public CountingEggsHenDecorator(Hen hen) {
    super(hen.getName(), hen.getColour(), hen.getBreed());
    this.hen = hen;
    this.counter = 0;
  }

  @Override
  public String layEgg() {
    counter++;
    return hen.layEgg();
  }

  @Override
  public List<String> layEggs(int nrOfEggs) {
    counter += nrOfEggs;
    return hen.layEggs(nrOfEggs);
  }

  public int getCounter() {
    return counter;
  }
}
