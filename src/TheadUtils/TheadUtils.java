/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheadUtils;

/**
 *
 * @author phamv
 */
public class TheadUtils  implements Runnable
{
    static int arr[] = new int[1000];
    private int fromIndex;
    private int toIndex;
    private long total;
    public TheadUtils(int fromIndex,int toIndex, int[] aaa)
    {
        this.fromIndex=fromIndex;
        this.toIndex=toIndex;
        this.arr = aaa;
        this.total = 0L;
    }
    public void run()
    { 
        for(int i = fromIndex; i<=toIndex;i++)
        total += arr[i];

    }
    public long getSum() 
    {
        return total;
    } 
}
