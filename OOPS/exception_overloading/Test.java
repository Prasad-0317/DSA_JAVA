package OOPS.exception_overloading;

public class Test {
    private void show(){
        System.out.println("1");
    }
}

class Xyz extends Test{
    void show() throws RuntimeException{
//        super.show();
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test t = new Test();
//        t.show();
        Xyz ob = new Xyz();
        ob.show();
    }
}

// if parent class has no exception then child can have unchecked exception
//here arithmetic , runtime exc is unchecked exception
// if exception is checked exception it gives compile error when parent has no exception

// if parent has exception then child can have same level of exc or its child class exc or no exc
// arithmetic and run are same level of exc
