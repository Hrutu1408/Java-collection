import java.util.*;
import java.util.LinkedList;
public class Window
{
    public int[] MaxSlidingWindow(int[] a,int k)
    {
        Deque<Integer> dq=new LinkedList<>();
        int n= a.length;
        int[] ans=new int[n-k+1];          
        int i=0;
        for(;i<n;i++)
        {
             while( !dq.isEmpty() && a[dq.peekLast()]<=a[i] )
             {
                    dq.removeLast();
             }
            ans[i-k]=a[dq.peekFirst()];
            while(!dq.isEmpty() && dq.peekFirst()<=i-k )
            {
                dq.removeFirst();
            }
        }
        ans[i-k]=a[dq.peekFirst()];
        return ans;
    }
    public static void main(String[] args)
    {
        Sliding s=new Sliding();
        int[] a={4 , 3 , 1 , 2 , 5 , 3 , 4 , 7 , 1 , 9};
        int k=3;
        int[] blank = s.MaxSlidingWindow(a, k);
        for (int i : blank)
        {
                System.out.print(i+" ");            
        }
    } 
}