package OOPS.exception_overloading;

interface i1{
    default void display1() {

    }
}
abstract class Abstract {
    abstract void display();
    void show(){
        System.out.println("1");
    }
}

class Abc implements i1{
    @Override
     public void display1() {
        System.out.println("display");
    }

    void show() throws RuntimeException{
        System.out.println("2");
    }

    public static void main(String[] args) {
//        Abstract t = new Abstract();
//        t.show();
        Abc ob = new Abc();
        ob.show();
        ob.display1();
    }
}

// if parent class is abstract has abstract method then child class should also have overridden method of it
// abstract class can not be instantiated we cannot make objects of it
// interface by default contains abstract methods
// Modifier 'protected' not allowed inside interface
// protected and default modifier of method in interface should have body