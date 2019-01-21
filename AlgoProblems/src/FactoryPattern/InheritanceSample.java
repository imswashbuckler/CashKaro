package FactoryPattern;

public class InheritanceSample {
    public static void main(String[] args) {
        Animal a = new Animal();
        Another t5 =  (Another) new Goat();
    }
}