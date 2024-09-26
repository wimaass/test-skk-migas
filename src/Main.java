import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        questNo1(12);
        questNo2A(5);
        questNo2B(5);
        questNo2C(5);
        questNo2D(5);
        questNo3();
    }

    public static void questNo1(int n){
        System.out.println("Number 1");
        for(int i = 1; i <= n; i++){
            if(i%3 == 0 && i%4 == 0){
                System.out.print("OKYES ");
            } else if (i%4 == 0) {
                System.out.print("YES ");
            } else if (i%3 == 0) {
                System.out.print("OK ");
            } else {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void questNo2A(int n){
        System.out.println("\nNumber 2a");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void questNo2B(int n){
        System.out.println("\nNumber 2b");
        for(int i = 1; i <= n; i++){
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void questNo2C(int n){
        System.out.println("\nNumber 2c");
        int count = 1;
        boolean isUnderBound = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(count == 1) isUnderBound = true;
                if(count == 5) isUnderBound = false;

                if(isUnderBound){
                    System.out.print(count);
                    count++;
                }
                if(!isUnderBound) {
                    System.out.print(count);
                    count--;
                }
            }
            System.out.println();
        }
    }

    public static void questNo2D(int n){
        System.out.println("\nNumber 2d");
        int [][] arr = new int[n][n];
        int count = 1;
        for(int i = 0; i < n; i++){
            if((i+1)%2 != 0 ){
                for(int j = 0; j < n; j++){
                    arr[j][i] = count;
                    count++;
                }
            } else {
                for(int j = arr.length-1; j >= 0; j--){
                    arr[j][i] = count;
                    count++;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void questNo3(){
        System.out.println("\nNumber 3");
        List<Integer> numbers = new ArrayList<>(Arrays.asList(12,9,13,6,10,4,7,2));
        List<Integer> newArr = numbers.stream().filter(x -> x % 3 != 0).sorted().toList();

        System.out.println(newArr);
    }
}
