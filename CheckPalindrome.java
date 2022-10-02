/*
Bobby
Lab4 CheckPalindrome
CSE007
a progream that checks if it's a palindrome
*/



import java.util.Scanner;
public class CheckPalindrome
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Please Enter your input");
		boolean isInt = scan.hasNextInt();//checking input data type
		//int inputint = scan.nextInt();
		
		if(isInt){//when input is integers
		   int inputint = scan.nextInt();
		    if(inputint<0){
            System.out.println("NO,integer can not less than 0");
        }
        if(inputint==0){
            System.out.println("yes is palindromes");
        }if(inputint>=11 && inputint<=100000){
        
        int resultint= 0;
        int temp = inputint ;
        while (temp!=0){// I dissassemble the input and reassemble the interger
            int p = temp%10;
            temp=temp/10;
            resultint = resultint * 10 +p ;
        }
        if(resultint == inputint ){//compare two integers if they are same them it is palindromescand viseversa
            System.out.println(inputint + " is palindromes");
        }else{
            System.out.println(inputint + " it's not a palindromes");
        }
        }else{// out of bounce out put
            System.out.println("input integer out of bounce input should larger than 11 or less than 100,000");
        }
        
		}else{//when input is a string
		    
		String str = scan.next();//save the string 
		String strr = new StringBuffer(str).reverse().toString();//reverse the string (found this on internet)
		//System.out.println(strr);
		
		if(str.equalsIgnoreCase(strr)){//check is the reverse equals to the input string and compare ignore case
		    System.out.println("yes " + str +" is palindromes");//yes palidromes
		}else{
		    System.out.println(str + " is not a palindromes");//no a palidromes
		}
		}
	}
}