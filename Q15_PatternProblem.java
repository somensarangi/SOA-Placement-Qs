package SET1;
/*
Write a java program to print the following pattern.
1
1 2 A
1 2 3 B A
1 2 3 4 C B A
1 2 3 4 5 D C B A
 */
public class Q15_PatternProblem {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            for(int j = 5; j>i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                System.out.print(j + 1 + " ");
            }
            for(int j = 65 + i - 1; j>=65; j--){
                System.out.print((char)(j)+" ");
            }
            System.out.println();
        }
    }
}
