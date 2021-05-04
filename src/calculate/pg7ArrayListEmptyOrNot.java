package calculate;

import java.util.ArrayList;

//Write a Java program to test an array list is empty or not. Define array list with
//underground tube names
public class pg7ArrayListEmptyOrNot {
    public static void main(String[] args) {
        //create Integer empty ArrayList
        ArrayList<String> array=new ArrayList<>(10);
        //check if array if empty
        boolean ans= array.isEmpty();
        if(ans==true)
        {
            System.out.println("1st Array list is empty");
        }
        else {
            System.out.println("1stArray list is not empty");
        }

        //addition of element to the arraylist
        array.add("\tDistrict Circle");
        array.add("\tJubilee");
        array.add("\tCentral");
        array.add("\tVictoria");
        //check if the list is empty or not
        ans=array.isEmpty();
        if (ans==true){
            System.out.println("2nd  array is empty");

        }
        else
            System.out.println("2nd array list is not empty");
    }
}
