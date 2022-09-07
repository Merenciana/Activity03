package alists;

import java.util.ArrayList;

public class ReverseOrder {
    public static void main(String[] args) {
        ArrayList<String> order = new ArrayList<String>();
        order.add("Red");
        order.add("Blue");
        order.add("Green");
        order.add("Yellow");
        order.add("Brown");
        for (int i = 4; i >= 0; i--) {
            System.out.println(order.get(i));

        }
    }

}
