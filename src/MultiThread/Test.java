/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

/**
 *
 * @author phamv
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Number num = new Number();
        Thread1 t1 = new Thread1(num);
        Thread2 t2 = new Thread2(num);
        t1.start();
        t2.start();
    }
    
}
