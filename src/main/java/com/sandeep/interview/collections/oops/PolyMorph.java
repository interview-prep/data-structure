package com.sandeep.interview.collections.oops;

/**
 * Created by Sandeep on 5/14/2017.
 */
public class PolyMorph {
    public static final int x = 0;
    Integer xx;
    String ss;
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        Animal aDog = new Dog();
        Animal aCat = new Cat();
        System.out.println(aDog instanceof Animal);
        if(d instanceof Animal){
//            d = new Animal();//Exception in thread "main" java.lang.ClassCastException: runtime
        }
        d.call();
        aDog.call();
        aCat.call();
        a.call();
        Cat c1 = new Cat();
        Animal aa = c1;		 //automatic upcasting to Animal
        Cat c2 = (Cat) aa;
        aa.call();
        c1.call();
    }
}

class Animal {
    public void call() {
        System.out.println("animal");
    }
}

class Dog extends Animal {
    public void call() {
        System.out.println("dog");
    }
}

class Cat extends Animal {
    public void call() {
        System.out.println("cat");
    }
}
