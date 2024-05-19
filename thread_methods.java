/*The sleep() method in Java is useful to put a thread to sleep for a specified amount of time .
        When we put a thread to sleep, the thread scheduler picks and executes another thread in the queue.
        Sleep() method returns void.
        sleep() method can be used for any thread, including the main() thread also.*/

import java.io.*;
import java.lang.Thread;
public class  thread_methods{
    public static void main(String[] args)
    {
        try {
            for (int i = 1; i <=5; i++) {
                Thread.sleep(2000);
                System.out.println(i);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
