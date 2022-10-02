
/*
Bobby
CSE007
HW WhatDAY
a crap that allow you to know what day ur born. I spend my entire life on this you better give a 100 or I will blow my head off infrount of you when you are eating. 
*/


import java.util.Scanner;
public class WhatDay
{
    
    public static boolean correctBound(int min,int max,int input){//methood use to determine if it's out of bound
        Scanner scan = new Scanner(System.in);
        if(input > max || input < min){
            return false;
        }else{
            return true;
        }
       // return true;
    }

    public static boolean isLeapYear(int year){// methood use to calculate if it is a leap year.
    boolean leap = false;
    if (year % 4 == 0) {//If the year is divisible by 4, it is a leap year.  
      if (year % 100 == 0) {//However, if it is also divisible by 100, it is not a leap year.
        if (year % 400 == 0)//BUT, if it is divisible by 400, it is a leap year. 
          leap = true;
        else
          leap = false;
      }
      else
        leap = true;
    }
    else
      leap = false;
      if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");

      return leap;
    }


	public static void main(String[] args) {
	    int month=0;// crap tons of variables
	    int day=0;
	    int year=0;
        int monthcode =0;
        int dateNumber = 0;
        int yearcode =0;
        int centuryCode = 0; 
        int leapYearCode = 0;
	    
		Scanner scan = new Scanner(System.in);
		
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Please enter a MONTH, a integer between 1 and 12");// check vaildation of MONTH 
        boolean isMonth = scan.hasNextInt();
        do{
		while(isMonth ==false){
		    System.out.println("unvaild Input out of bound or not a integer");
		    scan.nextLine();
		    System.out.println("Enter an Integer value for MONTH");
		   isMonth = scan.hasNextInt();
		}
        month = scan.nextInt();

        isMonth = correctBound(1,12,month);
        }while(isMonth == false);
		System.out.println("you enter "+ month + " for MONTH");
		/////////////////////////////////////////////////////////////////////////
        System.out.println("Please enter a DAY, a integer between 1 and 31");//check vaildation of DAY
        boolean isDay = scan.hasNextInt();
        do{
		while(isDay ==false){
		    System.out.println("unvaild Input out of bound or not a integer");
		    scan.nextLine();
		    System.out.println("Enter an Integer value for DAY");
		   isDay = scan.hasNextInt();
		}
        day = scan.nextInt();

        isDay = correctBound(1,31,day);
        }while(isDay == false);
		System.out.println("you enter "+ day + " for DAY");
		/////////////////////////////////////////////////////////////////////////
        System.out.println("Please enter a YEAR, a integer between 1700 and 2399");//check vaildation of YEAR
        boolean isyear = scan.hasNextInt();
        do{
		while(isyear ==false){
		    System.out.println("unvaild Input out of bound or not a integer");
		    scan.nextLine();
		    System.out.println("Enter an Integer value for YEAR");
		   isyear = scan.hasNextInt();
		}
        year = scan.nextInt();

        isyear = correctBound(1700,2399,year);
        }while(isyear == false);
		System.out.println("you enter "+ year + " for YEAR");
        ///////////////////////////////////////////////////////////////////////////
        System.out.println("your input   Year:" + year + "  Month: " + month + "  Day: " + day);//Show user input

        yearcode = year%100;
        yearcode = (yearcode+(yearcode/4))%7;
        System.out.println("The yearCode is: " + yearcode);

        switch(month){// use switch to determine monthCode
            case 1: monthcode = 0;
                //leapYearCode = leapYearCode-1;
                break;
            case 2: monthcode = 3;
                //leapYearCode = leapYearCode-1;
                break;
            case 3: monthcode = 3;break;
            case 4: monthcode = 6;break;
            case 5: monthcode = 1;break;
            case 6: monthcode = 4;break;
            case 7: monthcode = 6;break;
            case 8: monthcode = 2;break;
            case 9: monthcode = 5;break;
            case 10: monthcode = 0;break;
            case 11: monthcode = 3;break;
            case 12: monthcode = 5;break;
        }
        System.out.println("The month code is :" + monthcode);

        centuryCode = year/100;//remove the last two degit to make it more clean
        centuryCode = centuryCode*100;//multiply by 100 to make it more clean
        if(centuryCode == 1700){// ecah case an possiable
            centuryCode = 4;
        }if(centuryCode == 1800){
            centuryCode = 2;
        }if(centuryCode == 1900){
            centuryCode = 0;
        }if(centuryCode == 2000){
            centuryCode = 6;
        }if(centuryCode == 2100){
            centuryCode = 4;
        }if(centuryCode == 2200){
            centuryCode = 2;
        }if(centuryCode == 2300){
            centuryCode = 2;
        }
        System.out.println("Your centuryCode is: " + centuryCode);// give user the centuryCode

        dateNumber = day;

        System.out.println("Your dateNumber is: " + dateNumber);// just print the dayCode since it's just the day number

        if(month ==1 || month ==2){// use methood to dertrmine leapYearCode
            isLeapYear(year);
        if(isLeapYear(year)==true){
            leapYearCode = -1;
        }else{
            leapYearCode = 0;
         }
        }
        System.out.println("The leapYearCode is: " + leapYearCode);//print leap year code

        
        int answer = (yearcode + monthcode + centuryCode + dateNumber -leapYearCode)%7; // add all the code and mod by 7 to get the asnwer
        String whatDay=" ";
        switch(answer){//switch once more to determine the day
            case 0: whatDay = "Sunday";break;
            case 1: whatDay = "monday";break;
            case 2: whatDay = "Tuesday";break;
            case 3: whatDay = "Wendesday";break;
            case 4: whatDay = "Thursday";break;
            case 5: whatDay = "Friday";break;
            case 6: whatDay = "Saturday";break;
        }

        System.out.println("You are born at: " + whatDay);//yessssssssssss boiiiiiiiiiiiiiiiiiiiiiii

	}
}
