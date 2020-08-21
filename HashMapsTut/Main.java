import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        // int a = 10;
        // int b = 3;
        // int c = 88;

        // HashMap<String, Integer> happy = new HashMap<String, Integer>();
        // happy.put("a", 10);
        // happy.put("b", 3);
        // happy.put("c", 88);

        // System.out.println(happy.get("c"));
        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("bobbyJoe1996", "FluffyP0nies!");
        fun.put("helloKitty", "aloVera!");
        fun.put("helloGuyd", "guyides!");

        // fun.remove("helloKitty"); // removes
        // fun.containsValue("aloVera!"); // containes value 
        // fun.containsKey("helloKitty!"); // containes key

        System.out.println(fun.containsKey("helloKitty"));
        // System.out.println(fun.containsValue("aloVera!"));
        // System.out.println(fun);
    }
}