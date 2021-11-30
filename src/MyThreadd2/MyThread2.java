/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyThreadd2;

import static java.lang.Thread.sleep;

/**
 *
 * @author phamv
 */
public class MyThread2 implements Runnable
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        MyThread2 myRunnable = new MyThread2();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("This is the main thread");
    }
    @Override
    public void run()
    {
        while (true) 
        { 
            try
            {
                System.out.println("This is the child Thread");
                sleep(1000);
            } 
            catch (InterruptedException ex) 
            {
                ex.printStackTrace();
            }
        }
    }
    
}
