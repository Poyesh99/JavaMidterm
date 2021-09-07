package datastructure;
import java.util.*;


public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        ArrayList<String> student = new ArrayList<String>();

        //add elements in ArrayList
        student.add("Poyesh");
        student.add("Tiana");
        student.add("Malahat");
        student.add("Mahsa");
        student.add("Shabnam");
        System.out.println("Result Before removing is:"  + student);


        //remove method
        student.remove( "Tiana");
        System.out.println("Result after removing one element is: "+student);

        //get method
        System.out.println("get method: "+ student.get(2));

        //for each loop
        System.out.println("For each loop result is:" );
        for(String name:student){
            System.out.println(name);

        }

        // while loop
        System.out.println("while loop result is:");
        int  len = student.size()-1;
        int i= 0;
        while (i<=len){
            System.out.println(student.get(i));
            i++;
        }

    }

}

