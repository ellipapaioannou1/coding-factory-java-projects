package gr.aueb.cf.ch5;

/*
Find the position of the max element of an array
 */

public class ArrayMaxApp {
    public static int getMaxPosition(int[] arr) {
        int maxArray = 0;
        for (int i = 0;i < arr.length; i++) { //iterate through array
            if (arr[i] > arr[maxArray]) {
                maxArray = i; //assign max value position to variable
            }
        }
        return maxArray;

    }
}
