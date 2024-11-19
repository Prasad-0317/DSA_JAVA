class Thread2 extends Thread{
//    public void run() throws Exception{ // it will give error : overridden method does not throw java.lang.Exception
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                Thread.sleep(500);
                System.out.println(i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class sleep_2 {
    public static void main(String[] args) {
        Thread2 t2 = new Thread2();
        t2.start();
    }
}
