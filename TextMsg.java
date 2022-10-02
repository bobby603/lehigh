/*The purpose of this program is to prompt the user 
to enter a common text message abbreviation and determine 
which abbreviation was entered and what it means.
Created w/ VSCode
*/

import java.util.Scanner;

public class TextMsg {
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);
        String userString;
        
         System.out.println("Input an abbreviation:");
         userString = scnr.next();
         //fill in the required expressions within the parens to match each abbreviations
         //hint: can you use == with strings?
         if (      ) { 
            System.out.println("for what it's worth");
         }
         else if (    ) {
            System.out.println("worst of all time");
         }
         else if (     ) {
            System.out.println("i don't really know");
         }
         else if (   ) {
            System.out.println("fear of missing out");
         } 
         else if (     ){
               System.out.println("in real life");
         }
         else {
            System.out.println("Unknown");
            }
   }
}