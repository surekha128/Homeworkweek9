package calculate;

import java.util.HashMap;

//9. Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.
public class pg9HashMap {
    public static void main(String[] args) {

// Create a HashMap object called people
        HashMap<Integer , String> people= new HashMap<Integer,String>();
// Add keys and values (Name, number)
        people.put(1,"Sneal");
        people.put(2,"Alece");
        people.put(3,"Denial");
        people.put(4,"zeel");
        people.put(5,"liza");

        for(Integer i:people.keySet()){
          //  System.out.println("key: " +i+ " value: " +people.get(i));
            System.out.println("key: " +i);
        }
    }
}
