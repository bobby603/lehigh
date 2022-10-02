/*
First test 
bobby
oo7 CSE
factoral calculator nice
*/

import java.util.Scanner;

public class Factorial{
    public static void main (String[] dezznuts){

        Scanner scan = new Scanner(System.in);
        int result = 1;
        System.out.print("enter a number");
        int lmao = scan.nextInt();

   while(lmao*(-1) > 0){// while loop to chenck validation, ask user to reenter a number if it's not vaild
        System.out.println("invaild number. re enter a number");
            lmao = scan.nextInt(); 
    }

    System.out.print("you enter: "+lmao+ " the factoral is:");
    for(int i = 1; i<=lmao; i++){// for loop to calculate the anster
            result = i*result;
            System.out.print(i + "*");// usr print to print the provress

        }
        System.out.print(" = " + result);// out the result lmao

    }
}