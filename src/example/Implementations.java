package example;

import java.util.ArrayList;
import java.util.Collections;

public class Implementations {

    public static void ex() {
        ArrayList<String> employess = new ArrayList<String>();
        employess.add("Wawan");
        employess.add("Asep");
        employess.add("Adam");
        employess.add("Putri");
        employess.add("Aceng");
        System.out.println("Create and Add Item => " + employess);
        System.out.println("Check Size => " + employess.size());
        System.out.println("Access Item (the second element) => " + employess.get(1));

        employess.set(0, "Budi");
        System.out.println("After Change Item => " + employess);

        employess.remove(0);
        System.out.println("After Remove Item => " + employess);

        Collections.sort(employess);
        System.out.println("After Sorted => " + employess);
    }


}
