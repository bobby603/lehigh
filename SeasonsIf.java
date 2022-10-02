import java.util.Scanner;

public class SeasonsIf
{
	public static void main(String[] args) 
    {
		Scanner input = new Scanner(System.in);
       System.out.print("please enter the date (String, int)");
       String month = input.next();
       int day = input.nextInt();
       String season;
       if ((month.equalsIgnoreCase("January")) || (month.equalsIgnoreCase("February")))
        {
           season = "winter";
       } else if (month.equalsIgnoreCase("March")) 
       {
           if (day < 20) {
               season = "winter";
           } 
       } else if ((month.equalsIgnoreCase("April")) || (month.equalsIgnoreCase("May"))) {
           season = "spring";
       } else if (month.equalsIgnoreCase("June")) 
       {
           else {
               season = "summer";}
       } 
       System.out.println(month+" "+day+" falls during "+ season);




	}
}
