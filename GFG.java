import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
  
public class GFG {
    public static void main(String[] args)
        throws IllegalStateException
    {
  
        // create object of Deque
        Deque<Integer> DQ
            = new LinkedBlockingDeque<Integer>(3);
  
        if (DQ.offerFirst(10))
            System.out.println("The Deque is not full and 10 is inserted");
        else
            System.out.println("The Deque is full");
  
        if (DQ.offerFirst(15))
            System.out.println("The Deque is not full and 15 is inserted");
        else
            System.out.println("The Deque is full");
  
        if (DQ.offerFirst(25))
            System.out.println("The Deque is not full and 25 is inserted");
        else
            System.out.println("The Deque is full");
  
        if (DQ.offerFirst(20))
            System.out.println("The Deque is not full and 20 is inserted");
        else
            System.out.println("The Deque is full");
  
        // before removing print Deque
        System.out.println("Deque: " + DQ);
    }
}




