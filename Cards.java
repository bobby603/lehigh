/*
Bobby
CSE 007 
lab3
a little program that gives you random cards
the program uses if else and switch statement
*/


import java.util.Random;
import java.util.Scanner;

public class Cards
{
	public static void main(String[] args) {
	    Random cardNumber = new Random();//Initialize the random generator
	    int number = cardNumber.nextInt(52);//create a number that is in between 0 and 51
	    //System.out.println(number);
	    
	    String suitName = "";// create two variable to use
	    String cardIdentity = "";
	    
	    int suitnum, cardnum;
	    
	    suitnum = number/13;//divide by 13 to indicate which suit name should we apply
	    if(suitnum <= 1){
	        suitName = "dimand";
	    }else if (suitnum <= 2){
	        suitName = "clubs";
	    }else if (suitnum <= 3){
	        suitName = "hearts";
	    } else{
	        suitName = "spades";
	    }
	    
	    cardnum = (number)%13;//moded by 13, the reminder will give you the card identity
	    switch(cardnum){// add a break for every each line because we only have to run the statement for once
	        case 0: cardIdentity = "King"; break;
	        case 1: cardIdentity = "Ace"; break;
	        case 2: cardIdentity = "2"; break;
	        case 3: cardIdentity = "3"; break;
	        case 4: cardIdentity = "4"; break;
	        case 5: cardIdentity = "5"; break;
	        case 6: cardIdentity = "6"; break;
	        case 7: cardIdentity = "7"; break;
	        case 8: cardIdentity = "8"; break;
	        case 9: cardIdentity = "9"; break;
	        case 10: cardIdentity = "10"; break;
	        case 11: cardIdentity = "Jack"; break;
	        case 12: cardIdentity = "Queen"; break;
	            default : System.out.println("some error occour please restart the progream");
	    }
	    ///*out put the result
        //I also added the calculation steps
        //no need to say thanks just give me your phone number ;D
	    System.out.println("Random Number is" + cardNumber);
	    int cardNumberd = number/13;
	    System.out.println(number + "/3=" + cardNumberd + "(Suit Number)");
	    cardNumberd = number + 1;
	    int ss = number%13;
	    System.out.println(number + "%13=" + ss + "(Card Identity)");
	    //*/
	    System.out.println(cardIdentity + " of " + suitName);
	
	    
	}
}
