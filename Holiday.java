/*A particular month has 30 days, numbered from 1 to 30.
  Day 1 is a Monday, and the usual 7-day week is followed (so day 2 is Tuesday, day 3 is Wednesday, and so on).
  Every Saturday and Sunday is a holiday. There are N festival days, which are also holidays. Note that it is possible for a festival day              
  to occur on a Saturday or Sunday.

  You are given the dates of the festivals. Determine the total number of holidays in this month.*/




import java.util.Scanner;

public class Holiday
 {
    public static void main(String[] args) 
	  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        int[] festivalDays = new int[N];
        System.out.println("Enter festival days:");
        for (int i = 0; i < N; i++) 
		    {
            	festivalDays[i] = scanner.nextInt();
      	}

        int count = 0;
        for (int day = 1; day <= 30; day++) 
		    {
            	if (day % 7 == 0 || day % 7 == 6 || isFestivalDay(day, festivalDays)) 
			        {
                		count++;
            	}
       	}
        System.out.println("Total holidays: " + count);
     }

    private static boolean isFestivalDay(int day, int[] festivalDays) 
	   {
         for (int festDay : festivalDays) 
		     {
            	if (festDay == day) 
			        {
                		return true;
             	}
          }
        return false;
     }
}
