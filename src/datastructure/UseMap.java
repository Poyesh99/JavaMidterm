package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        HashMap<Integer, String> name = new HashMap<>();
        name.put(8454, "Poyesh");
        name.put(4567, "Malahat");
        name.put(7898, "Tiana");
        System.out.println(name.get(8454));
        name.remove(7898);
        System.out.println(name);
        System.out.println();
        //print all the Keys
        System.out.println(name.keySet());
        //array form
        System.out.println(name.entrySet());
        List<String> fastFood = new ArrayList<>();
        fastFood.add("hamburger");
        fastFood.add("hotdog");
        List<String> schoolSupplies = new ArrayList<>();
        schoolSupplies.add("pencils");
        schoolSupplies.add("pens");
        schoolSupplies.add("paper");
        Map<String, List <String>> m = new HashMap<>();
        m.put("pencil", schoolSupplies);
        m.put("pizza", fastFood);
        for(Map.Entry<String, List<String>> fruit: m.entrySet()) {
            System.out.println(fruit.getKey());
            System.out.println(fruit.getValue());
        }
    }

}
