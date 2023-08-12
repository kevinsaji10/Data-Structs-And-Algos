import java.util.*;

public class RepeatedInteger {
    public static void repeatTracker(int[] arr) {
        // create a new hashset to store repeated integers
        Set<Integer> set = new HashSet<>();
        // to track the number of times + operator is used.
        int addCounter = 0;
        //nested for loop to compare every element in the array to check for repetition
        for(int i = 0; i<arr.length; i++) {
            for (int j = 0; j<arr.length; j++) {
                addCounter++;
                if (arr[i] == arr[j] && i != j) {
                    set.add(arr[i]);
                    break;
                }
            }
        }
        // printing output
        System.out.println("Repeated integers:");
        for (Integer i : set) {
            System.out.println(i);
        }
        System.out.println("Number of times the + operator is used in this algorithm: " + addCounter);
    }
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 4, 3, 2, 4, 4};
        repeatTracker(arr);
    }
    
}