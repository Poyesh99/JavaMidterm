package datastructure;
import algorithm.Sort;
import java.util.*;

public class UseQueue {

    private static void  ForEach(  Queue<String> names){

        System.out.println("For Each Loop result is: ");

        for(String  name: names){
            System.out.println(name);
        }



    }

    private static void  WhileLoop( Queue<String> names){

        System.out.println("While Loop result is:");

        // using Iterator to iterate through a queue
        Iterator<String> itr = names.iterator();

        // hasNext() returns true if the queue has more elements
        while (itr.hasNext())
        {
            // next() returns the next element in the iteration
            System.out.println(itr.next());
        }


    }

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        Queue<String> names = new PriorityQueue<>();

        // Add string to end of Queue
        names.add("Poyesh");
        names.add("Tiana");
        names.add("Malahat");
        names.add("Mahsa");
        names.add("Shabnam");


        System.out.println(names);
        System.out.println("Peek: "+names.peek());
        System.out.println("After removing one item the results is:");
        System.out.println("Remove: "+names.remove());
        System.out.println(names);
        System.out.println("After polling item the result is:  \n"+names.poll());
        System.out.println(names);

        WhileLoop(names);
        ForEach(names);
    }

}
 //  line 55: retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
  //  Line 57: //retrieves and removes the head of this queue.
//line 59: // print head and deletes the head

