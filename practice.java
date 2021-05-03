import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
class Main
{
  
    public static int findKthLargest(List<Integer> ints, int k)
    {
  
        PriorityQueue<Integer> pq = new PriorityQueue<>(ints.subList(0, k));
 
      
        for (int i = k; i < ints.size(); i++)
        {

     
