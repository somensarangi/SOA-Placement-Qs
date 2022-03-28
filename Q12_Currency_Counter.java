package SET1;
/*
Assume you have different currency notes of values Rs. 1, Rs 2, Rs. 5, Rs. 10, Rs. 20,
Rs. 50 and Rs. 100 respectively. Write a program to calculate the minimum number of
currency notes required to make a certain amount of Rs X.
 */
import java.util.*;
public class Q12_Currency_Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an amount: ");
        int amount = sc.nextInt();
        countCurrency(amount);
    }
    static void countCurrency(int amount){
        int[] notes = new int[]{ 100, 50, 20, 5, 2, 1 };
        int totalNotes = notes.length;
        int[] noteCounter = new int[totalNotes];

        for (int i = 0; i < totalNotes; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }
        System.out.println("Currency Count ->");
        for (int i = 0; i < totalNotes; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
}}
