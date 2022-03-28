package SET1;
/*
Write a java program to arrange the element of an integer array so that all negative
element will be at one side and all positive element will be in other side.
 */
import java.util.*;
public class Q8_Arranging_Elements_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter elements in the array");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Array formed is: ");
        for(int i=0; i<size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Arranged Array is "+Arrays.toString(ArrangingArray(array)));
    }
    static int[] ArrangingArray(int[] array){
        for(int i = 0; i<array.length; i++){
            for(int j = i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
        return array;
    }
}
