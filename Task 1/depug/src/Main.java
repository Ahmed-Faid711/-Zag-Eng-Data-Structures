import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int array []={12,11,100,13,5,4};

       for (int i=0;i< array.length;i++) {
           System.out.printf("Enter a number:");


           if (array[i] % 2 == 0)
               System.out.println("the number is even");

           else
               System.out.println("the number is odd");

       }
        }
    }
