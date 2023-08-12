// Let B be an array of size n ≥ 6 containing integers from 1 to n − 5 inclusive, five of which are
// repeated.
// For e.g. if n is 7, the array would contain integers 1 to 2, and this array would contain an integer (1 or
// 2) which is repeated another 5 times, thus total 6 occurrences of this integer in the array.
// One possible array would contain 1, 1, 1, 1, 1, 1, 2.
// Another possibility is 1, 2, 2, 2, 2, 2, 2.
// a. Describe an algorithm for finding the five integers in B that are repeated.
// b. Track a specific operator (e.g., >, +, −) that occurs the most often in your algorithm. How
// many times does it repeat?
import java.util.*;
public class ComponentAdd {
    public static void adder(int[][][] arr1, int[][][] arr2) {
        // variable to count number of + operators used
        int addCounter = 0;
        // triple nested for loop to iterate through 3d arrays
        for (int i = 0; i<arr1.length; i++) {
            for (int j = 0; j<arr1[i].length; j++) {
                for (int k = 0; k<arr1[i][j].length; k++) {
                    addCounter++;
                    arr1[i][j][k] += arr2[i][j][k];
                }
            }
        }
        // printing output
        System.out.println("Number of times + operator was used: " + addCounter);
        System.out.println(Arrays.deepToString(arr1));

        
    }
    public static void main(String[] args) {
    // test1 and test2 are 3d arrays
    int[][][] test1 = {
        {
        {1, -2, 3}, 
        {2, 3, 4}
        }, 
        { 
        {-4, -5, 6, 9}, 
        {1}, 
        {2, 3}
        } 
    };
    int[][][] test2 = {
        {
        {0, -5, -4}, 
        {2, 7, 9}
        }, 
        { 
        {-5, -5, 2, 2}, 
        {1}, 
        {3, -9}
        } 
    };
    adder(test1, test2);
            
    }
}
