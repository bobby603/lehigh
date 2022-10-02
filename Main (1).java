import java.util.Scanner;
public class WhatDay
{
	public static void main(String[] args) {
	    int month = 0;
	    int day = 0;
	    int year = 0;
        int monthcode = 0;
        int dateNumber = 0;
        int yearcode =0;
        int centuryCode = 0; 
        int leapYearCode = 0;
        boolean isLeapYear = false;
		Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a MONTH, a integer between 1 and 12");
        boolean isMonth = scan.hasNextInt();
        do{
		while(isMonth ==false){// ask for input for month
		    System.out.println("unvaild Input out of bound or not a integer");
		    scan.nextLine();
		    System.out.println("Enter an Integer value for MONTH");
		    isMonth = scan.hasNextInt();
		}
        month = scan.nextInt();
        if(month < 1|| month>12){//check the input
            isMonth = false;
        }else{
            isMonth = true;
        }
        }while(isMonth == false);
		System.out.println("you enter "+ month + " for MONTH");
        System.out.println("Please enter a DAY between 1 and 31");
        boolean isDay = scan.hasNextInt();
        do{
		while(isDay ==false){// ask for input forday
		    System.out.println("unvaild Input out of bound or not a integer");
		    scan.nextLine();
		    System.out.println("Enter an Integer value for DAY");
		    isDay = scan.hasNextInt();
		}
        day = scan.nextInt();
        if(1 > day || 31 < day){//check the input for day
            isDay = false;
        }else{
            isDay = true;
        }
        }while(isDay == false);
		System.out.println("you enter "+ day + " for DAY");
        System.out.println("Please enter a YEAR, a integer between 1700 and 2399");
        boolean isyear = scan.hasNextInt();
        do{
		while(isyear ==false){//ask for a year input
		    System.out.println("unvaild Input out of bound or not a integer");
		    scan.nextLine();
		    System.out.println("Enter an Integer value for YEAR");
		   isyear = scan.hasNextInt();
		}
        year = scan.nextInt();
        if(1700 > year || 2399 < year){//chechk the input for year
            isyear = false;
        }else{
            isyear = true;
        }
        year = scan.nextInt();
        }while(isyear == false);
		System.out.println("you enter "+ year);
        yearcode = year%100;
        yearcode = (yearcode+(yearcode/4))%7;
        System.out.println("The yearCode is: " + yearcode);
        switch(month){//use switch for monthCode
            case 1: monthcode = 0;
                break;
            case 2: monthcode = 3;
                break;
            case 3: 
                monthcode = 3;
                break;
            case 4: 
                monthcode = 6;
                break;
            case 5:
                 monthcode = 1;
                 break;
            case 6:
                 monthcode = 4;
                 break;
            case 7:
                 monthcode = 6;
                 break;
            case 8: 
                monthcode = 2;
                break;
            case 9:
                 monthcode = 5;
                 break;
            case 10: 
                monthcode = 0;
                break;
            case 11: 
                monthcode = 3;
                break;
            case 12: 
                monthcode = 5;
                break;
        }

        centuryCode = year/100;
        centuryCode = centuryCode*100;

        if(centuryCode == 1700){
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
        dateNumber = day;

        if(month ==1 || month ==2){ // check month 1 and month 2 and check if the year is a leap year
             if (year % 4 == 0) { 
                 if (year % 100 == 0) {
                      if (year % 400 == 0)
                          isLeapYear = true;
                     else
                  isLeapYear = false;
                 }
             else
          isLeapYear = true;
         }
      else
      isLeapYear = false;
      if (isLeapYear)
      System.out.println(year);
      else
      System.out.println(year);
        if(isLeapYear==true){
            leapYearCode = -1;
        }else{
            leapYearCode = 0;
         }
        }

        int answer = (yearcode + monthcode + centuryCode + dateNumber -leapYearCode)%7; // final out puts
        String whatDay=" ";
        switch(answer){
            case 0: 
                whatDay = "Sunday";
                break;
            case 1:
                whatDay = "monday";
                break;
            case 2: 
                whatDay = "Tuesday";
                break;
            case 3:
                whatDay = "Wendesday";
                break;
            case 4:
                whatDay = "Thursday";
                break;
            case 5: 
                whatDay = "Friday";
                break;
            case 6: 
                whatDay = "Saturday";
                break;
        }
        System.out.println("You born at this day: " + whatDay);

	}
}