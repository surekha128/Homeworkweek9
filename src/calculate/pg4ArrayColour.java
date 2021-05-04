package calculate;

import java.util.ArrayList;

//4. Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.
public class pg4ArrayColour {
    public static void main(String[] args) {

        ArrayList list = new ArrayList(10);
        list.add(0, "Blue");
        list.add(1, "Violate");
        list.add(2, "Gray");
        list.add(3, "White");
        list.add(4, "Yellow");
        list.add(5, "Black");
        list.add(6, "Orange");
        list.add(7, "Green");
        list.add(8, "Red");
        list.add(9, "Pink");
        list.add(10, "Green");

        //System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}