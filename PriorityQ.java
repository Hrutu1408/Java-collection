import java.util.ArrayList;
import java.util.*;
import java.util.PriorityQueue;
class PriorityQ
{
    int[] kLargest(int[] arr, int n, int k)
    {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            if(i<k)
            {
                pq.add(arr[i]);
            }
            else
            {
                if(pq.peek()<arr[i])
                {
                    pq.poll();
                    pq.add(arr[i]);
                }
            }
        }
      ArrayList<Integer> arrlst=new ArrayList<>(pq);
      int[] blank=new int[arrlst.size()];
      for(int i=0;i<arrlst.size();i++)
      {
         blank[i]=arrlst.get(i);
      }
      return blank;
    }
    public static void main(String[] args)
    {
        int[] arr = {4,55,1,7,8};
        int n=5;
        int k=2;
        PriorityQ p=new PriorityQ();
        int[] blankarray=p.kLargest(arr, n, k);
        for(int i:blankarray)
        {
            System.out.println(i);
        }       
    }
}