package OOPS.Polymorphism;

public class Animal_eg2{
    void eat(){System.out.println("animal is eating...");}
}

class Dog extends Animal_eg2{
    void write(){System.out.println("dog is eating...");}
}

class BabyDog1 extends Dog{
    public static void main(String[] args){
        Animal_eg2 a=new BabyDog1();
        a.eat();
//        static final eg= 2;
//        int c = b;
    }}