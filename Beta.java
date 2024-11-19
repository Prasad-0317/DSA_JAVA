//
//class BoolArray
//{
//    boolean [] b = new boolean[3];
//    int count = 0;
//
//    void set(boolean [] x, int i)
//    {
//        x[i] = true;
//        ++count;
//    }
//
//    public static void main(String [] args)
//    {
//        BoolArray ba = new BoolArray();
//        ba.set(ba.b, 0);
//        ba.set(ba.b, 2);
//        ba.test();
//    }
//
//    void test()
//    {
//        if ( b[0] && b[1] | b[2] )
//            count++;
//        if ( b[1] && b[(++count - 2)] )
//            count += 7;
//        System.out.println("count = " + count);
//    }
//}

// eg2
//class operator{
//    public static void main(String[] args) {
//        Float f = new Float("12");
//        switch (f)
//        {
//            case 12: System.out.println("Twelve");
//            case 0: System.out.println("Zero");
//            default: System.out.println("Default");
//        }
//    }
//}

//class operator{
//    class abc{
//
//    }
//    public static void main(String[] args) {
//
//    }
//}

// thread

//class MyThreadR extends Thread
//{
//    MyThreadR() {}
//    MyThreadR(Runnable r) { }
//    public void run()
//    {
//        System.out.print("Inside Thread ");
//    }
//}
//class MyRunnable implements Runnable
//{
//
//    public void run()
//    {
//        System.out.print(" Inside Runnable");
//    }
//}
//class Test
//{
//    public static void main(String[] args)
//    {
//        new MyThreadR().start();
//        new MyRunnable(new MyRunnable()).start();
//    }
//}

// eg 3

//public class operator_eg
//{
//    public static int y;
//    public static void foo(int x)
//    {
//        System.out.print("foo ");
//        y = x;
//    }
//    public static int bar(int z)
//    {
//        System.out.print("bar ");
//        return y = z;
//    }
//    public static void main(String [] args )
//    {
//        int t = 0;
//        assert t > 0 : bar(7);
////        assert t > 1 : foo(8); /* Line 18 */
//        System.out.println("done ");
//    }
//}

//      eg 4

//class Two
//{
//    byte x;
//}
//
//class PassO
//{
//    public static void main(String [] args)
//    {
//        PassO p = new PassO();
//        p.start();
//    }
//
//    void start()
//    {
//        Two t = new Two();
//        System.out.print(t.x + " ");
//        Two t2 = fix(t);
//        System.out.println(t.x + " " + t2.x);
//    }
//
//    Two fix(Two tt)
//    {
//        tt.x = 42;
//        return tt;
//    }
//}

//          eg 5

//class X
//{
//    public static void main(String [] args)
//    {
//        X x = new X();
//        X x2 = m1(x); /* Line 6 */
//        X x4 = new X();
//        x2 = x4; /* Line 8 */
////        doComplexStuff();
//    }
//    static X m1(X mx)
//    {
//        mx = new X();
//        return mx;
//    }
//}

//      eg

//class Test
//{
//    public static void main(String [] args)
//    {
//        int x= 0;
//        int y= 0;
//        for (int z = 0; z < 5; z++)
//        {
//            if (( ++x > 2 ) || (++y > 2))
//            {
//                x++;
//            }
//        }
//        System.out.println(x + " " + y);
//    }
//}

//          eg

//import java.awt.Button;
//public class solved_eg
//{
//    public static void main(String [] args)
//    {
//        float f = 42.0f;
//        float [] f1 = new float[2];
//        float [] f2 = new float[2];
//        float [] f3 = f1;
//        long x = 42;
//        f1[0] = 42.0f;
//    }
//}

//    reference variables f1 and f3 refer to the same array object.

//          eg

//public class solved_eg
//{
//    public static class MyInner
//    {
//        public static void foo() { }
//    }
//}

//         ----- eg ---

//class solved_eg{
//    public static void main(String[] args) {
//        try
//        {
//            Float f1 = new Float("3.0");
//            int x = f1.intValue();
//            byte b = f1.byteValue();
//            double d = f1.doubleValue();
//            System.out.println(x + b + d);
//        }
//        catch (NumberFormatException e) /* Line 9 */
//        {
//            System.out.println("bad number"); /* Line 11 */
//        }
//    }
//}

//          --- eg ---

//public class solved_eg
//{
//    static int x;
//    static boolean catchTry()
//    {
//        x++;
//        return true;
//    }
//    public static void main(String[] args)
//    {
//        x=0;  // int x = 0 then it will print x = 1
//        if ((catchTry() | catchTry()) || catchTry())
//            x++;
//        System.out.println(x);
//    }
//}

//          eg

//class ab{
//    public static void main(String[] args) {
//        void start() {
//            A a = new A();
//            B b = new B();
//            a.s(b);
//            b = null; /* Line 5 */
//            a = null;  /* Line 6 */
//            System.out.println("start completed"); /* Line 7 */
//        }
//    }
//}

// abstract

//abstract class demo
//{
//    public int a;
//    demo()
//    {
//        a = 10;
//    }
//
//    abstract public void set(int a);
//
//    abstract public void get();
//
//}
//
//class Test extends demo
//{
//    public void set(int a)
//    {
//        this.a = a;
//    }
//
//    final public void get()
//    {
//        System.out.println("a = " + a);
//    }
//
//    public static void main(String[] args)
//    {
//        Test obj = new Test();
//        obj.set(20);
//        obj.get();
//    }
//}

// abstract

//class Test
//{
//    int a=0;
//
//    static
//    {
//        int a = 4;
//        System.out.println ("inside static block");
//                System.out.println ("a = " + a);
//    }
//
//    Test()
//    {
//        System.out.println ("inside constructor");
//                a = 10;
//    }
//
//    public static void func()
//    {
//        int a=0;
//        a = a + 1;
//        System.out.println ("a = " + a);
//    }
//
//    public static void main(String[] args)
//    {
//
//        Test obj = new Test();
//        obj.func();
//
//    }
//}


//  constructor eg

//final class Complex {
//    final  double re,  im;
//    public Complex(double re, double im) {
//        this.re = re;
//        this.im = im;
//    }
//    Complex(Complex c)
//    {
//        System.out.println("Copy constructor called");
//                re = c.re;
//        im = c.im;
//    }
//    public String toString() {
//        return "(" + re + " + " + im + "i)";
//    }
//}
//class Mai {
//    public static void main(String[] args) {
//        Complex c1 = new Complex(10, 15);
//        Complex c2 = new Complex(c1);
//        Complex c3 = c1;
//        System.out.println(c2);
//    }
//}

//class  solved_eg{
//public static void main(String[] args) {
//    solved_eg obj = new solved_eg();
//        obj.start();
//        }
//        void start() {
//        String stra = "do";
//        String strb = method(stra);
//        System.out.print(": "+stra + strb);
//        }
//        String method(String stra) {
//        stra = stra + "good";
//        System.out.print(stra);
//        return "good";
//        }
//}


import java.io.*;
class Test
{
    public void display() throws IOException
    {
        System.out.println("Test");
    }

}

class solved_eg extends Test
{
    public void display() throws IOException
    {
        System.out.println("Derived");
    }
    public static void main(String[] args) throws IOException
    {
        Test object = new Test();
        object.display();
    }
}
