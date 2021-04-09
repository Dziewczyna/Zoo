package com.zoo.decorated.hen;

public class Runner {
  public static void main(String[] args) {
    Hen hen = new Hen("tasia",
        "yellow", "zielononozka");
    CountingEggsHenDecorator countingEggsHenDecorator = new CountingEggsHenDecorator(hen);

    countingEggsHenDecorator.layEggs(4);
    System.out.println(countingEggsHenDecorator.getCounter());
  }
}
