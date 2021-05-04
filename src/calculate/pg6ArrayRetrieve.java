package calculate;

import java.util.ArrayList;
import java.util.List;

//6. Write a Java program to retrieve an element (at a specified index) from a given array list
public class pg6ArrayRetrieve {
    public static void main(String[] args) {

        List<String>stringList=new ArrayList<String>(8);
        stringList.add(0,"White");
        stringList.add(1,"Red");
        stringList.add(2,"Picnic");
        stringList.add(3,"Borrow");
        stringList.add(4,"Blind");
        stringList.add(5,"Detect");
        stringList.add(6,"Que");
        stringList.add(7,"People");
        stringList.add(8,"Joke");

        System.out.println(stringList);
        System.out.println();
        //retrieve array element
      String  element=stringList.get(2);
      String  element1=stringList.get(8);
        System.out.println("retrieve array elememnt is: "+element);
        System.out.println("retrieve array elememnt is: "+element1);
    }
}
