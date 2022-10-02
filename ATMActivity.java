//Bobby Guo ATMActivity
//computerScience professor 
//CSE 007
//this is an ATM simulator play with it! it has three abuilitys Deposit Withdraw and check balance
//With fake money.... Have fun

import java.util.Scanner;

public class ATMActivity
{
	public static void main(String[] args) {
		
		boolean tf;
		double deposit =0;
		int password;
		String username;
	    char owner = 'X';
        int op;
        final double min = 20;
        boolean startlock = true;
        int ppap;
        String example = "Example username:Abc123\nExample password:1234";
        Scanner scanner = new Scanner(example);
        //char y = 'B';
        //boolean
        //double witdraw;
        Scanner scan = new Scanner(System.in);
        
       // System.out.println("start the progream?");
        
       // y = scan.nextChar();

       while(startlock){

        System.out.println("please enter the start password (password is 123)");
        ppap = scan.nextInt();

        if(ppap == 123){
            startlock = false;

        }else{

            System.out.println("wrong passwords");
            
        }

       }

        
        
        
        //while(start){
		
        //System.out.println("Please enter the first letter of your last name");
        //y = scan.nextLine();
        System.out.println(scanner.nextLine());
        System.out.println("please creat your username");
        username = scan.next();
        System.out.println(scanner.nextLine());
        System.out.println("Please create your passwords (numbers only)");
        password = scan.nextInt();

		
		System.out.println("Welcome to the Bank of America ATM System \nMain menu");
		System.out.println("1 - View my balance");
		System.out.println("2 - Witdraw Cash");
		System.out.println("3 - Deposit funds");
		System.out.println("4 - Exit");
        op = scan.nextInt();

        while(op==1||op==2||op==3||op==4){
            switch(op){
                case 1:
                System.out.println(owner + "your balance is"+ deposit);
                //op = scan.nextInt();

                break;
                
                case 2:
                    
                    System.out.println("how much " + owner +" ?");
                    double witdraw = scan.nextDouble();
                    if(deposit - witdraw < min){
                        System.out.println("not enough moneyo or money in your account is less than: " + min);
                        //break;
                    }
                    if(witdraw < 0){
                        System.out.println("number has to be postive");
                    }
                    
                    if(deposit - witdraw > min){
                        System.out.println("you witdraw: " + witdraw + ". your balance is "+ deposit);
                    }
                    
                    //op = scan.nextInt();
                    //break;
                    break;
                    
                    case 3:
                        System.out.println(owner + " enter how much you wanna deposit");
                        int ip =scan.nextInt();
                        deposit = deposit + ip;
                        System.out.println("your balance is now:"+ deposit);
                        break;
                        
                case 4:

                //System.out.println("befor exit is tell us about our system");
                //trash = scan.nextLine();

               // System.out.println(scan.nextLine());

                System.out.println("Exiting.......\nExited");
               // op = 100;
                System.exit(1);
                break;
            }
            
            //op = scan.nextInt();
            System.out.println("========================================================");
            System.out.println("hi " + owner);
        System.out.println("1 - View my balance");
		System.out.println("2 - Witdraw Cash");
		System.out.println("3 - Deposit funds");
		System.out.println("4 - Exit");
		op = scan.nextInt();
        }
		
        }	
		
	}
//}