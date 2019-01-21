package FactoryPattern;

public class Animal  {
    public void eat(String str) {
        System.out.println("Eating for grass");
    }
}

class Goat extends Animal {
    public void eat(String str) {
        System.out.println("blank");
    }
}

class Another extends Goat{
  public void eat(String str) {
        System.out.println("another");
  }
}


