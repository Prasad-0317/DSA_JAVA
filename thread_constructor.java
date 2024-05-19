class MyThread1 extends Thread implements Runnable{
    public MyThread1(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("I am thread..");
    }
}
public class thread_constructor {
    public static void main(String[] args) {
        MyThread1 bullet1 = new MyThread1("psc");
        Thread gun1 = new Thread(bullet1);
        gun1.start();
        System.out.println("id of gun is :" + gun1.threadId());
        System.out.println("Name :" + gun1.getName());
        System.out.println("Name :" + bullet1.getName());
    }
}
