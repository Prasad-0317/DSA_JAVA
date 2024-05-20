class Thread1 extends Thread{
    public void run(){
        System.out.println("daemon thread");
    }
}
public class daemon_threads {
    public static void main(String[] args) {
        Thread.currentThread().setDaemon(true); // exception .IllegalThreadStateException
        System.out.println("Main thread"); // this is necessary bcoz to daemon thread will run only when there is some service
        Thread1 t1 = new Thread1();
        t1.setDaemon(true);
        t1.start();
//        t1.setDaemon(true); //when setDaemon after t1.start() gives error,  Exception in thread "main" java.lang.IllegalThreadStateException
    }
}
