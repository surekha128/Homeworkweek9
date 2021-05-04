package calculate;
//3. Write a Java program to reverse an array of integer values.
import java.util.Arrays;
public class pg3ArrayReverse {
    public static void main(String[] args) {
        int[] my_array1 = {1,30,5,4,8,21,3,28};
System.out.println("actual array : "+Arrays.toString(my_array1));
   for(int i = 0; i < my_array1.length / 2; i++)
    {
        int temp = my_array1[i];
        my_array1[i] = my_array1[my_array1.length - i - 1];
        my_array1[my_array1.length - i - 1] = temp;
    }
    System.out.println("Reverse array : "+Arrays.toString(my_array1));
}
    }
