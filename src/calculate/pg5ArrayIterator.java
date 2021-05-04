package calculate;
//5. Write a Java program to iterate through all elements in an array list using Iterator.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class pg5ArrayIterator {
    public static void main(String[] args) {
        ArrayList<String>nameList= new ArrayList<String>(Arrays.asList("Sky","Friend","Life is beautiful","Learn","Earn","Sweet"));
        ListIterator<String>listIterator=nameList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
