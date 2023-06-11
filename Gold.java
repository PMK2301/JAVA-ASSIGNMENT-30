/*A bulb company claims that the average lifetime of its bulbs is at least X units.
  The company ran a test on N bulbs. You are given the lifetime of N−1 of these bulbs. What is the minimum non-negative integer value of           
  lifetime the remaining bulb can have, such that the claim of the company holds true?*/

import java.util.Scanner;

public class Gold 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total amount of gold in the mine (X): ");
        int X = scanner.nextInt();

        System.out.print("Enter the number of friends (N): ");
        int N = scanner.nextInt();

        System.out.print("Enter the maximum capacity of each person (Y): ");
        int Y = scanner.nextInt();

        boolean canCarryAllGold = canCarryGold(X, N, Y);
        System.out.println("Chef and his friends can" + (canCarryAllGold ? "" : "not") + " carry all the gold from the gold mine.");
    }

    private static boolean canCarryGold(int X, int N, int Y) 
	  {
        int totalCapacity = (N + 1) * Y;
        return X <= totalCapacity;
    }
}
