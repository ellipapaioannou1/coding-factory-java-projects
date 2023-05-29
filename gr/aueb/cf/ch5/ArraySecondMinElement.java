package gr.aueb.cf.ch5;
/*
Find the second min element of a given array
The app sorts an array in ascending way and the second min element is in the [1] position
 */
public class ArraySecondMinElement {

    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 55, 2, 1};
        BubbleSortArr(arr); //sorted array ascending
        System.out.println("Second min element is: " + arr[1]); //the second min element is at position [1] of the sorted array
    }
    public static void BubbleSortArr(int[] arr) {
        //sorting array ascending
        for (int i=0;i< arr.length-1;i++) {
            for (int j=0;j< arr.length-i-1;j++){
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp; //swap elements
                }
            }
        }
    }






}
