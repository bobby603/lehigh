
/*
Bobby Guo
9/8 2022
Phonenumber
this progream called Phonenumber use to pratice modulus
to isolate separate digits in an int value in order 
to reformat the phone number as a String.
*/
import java.util.Scanner;
public class PhoneNumber
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a 10 digit phone number");
        long phoneNumber = scan.nextLong();
        System.out.println("Formatted phone number:");

        System.out.println("(" + phoneNumber/10000000 + ")" + (phoneNumber%10000000)/10000 + "-" + phoneNumber%10000);


	}
}
