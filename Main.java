import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Please Enter your input");
		boolean isInt = scan.hasNextInt();
		//int inputint = scan.nextInt();
		
		if(isInt){
		   int inputint = scan.nextInt();
		    if(inputint<0){
            System.out.println("NO,integer can not less than 0");
        }
        if(inputint==0){
            System.out.println("yes is palindromes");
        }
        
        int resultint= 0;
        int temp = inputint ;
        while (temp!=0){
            int p = temp%10;
            temp=temp/10;
            resultint = resultint * 10 +p ;
        }
        if(resultint == inputint ){
            System.out.println("yes is palindromes");
        }else{
            System.out.println("it's not a palindromes");
        }
        
		}else{
		    
		    
	
		    
		}
		
	}
}
