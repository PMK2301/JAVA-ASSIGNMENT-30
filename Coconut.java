/*Chefland has 2 different types of coconut, type A and type B. Type A contains only x milliliters of coconut water and 
  type B contains only y grams of coconut pulp. Chef's nutritionist has advised him to consume X  milliliters of 
  coconut water andY grams of coconut pulp every week in the summer. Find the total number of coconuts (type A + type B)
  that Chef should buy each week to keep himself active in the hot weather.*/
  

import java.util.*;
public class Coconut 
{
    public static void main(String[] args) 
	{
        int water = 500; // Required milliliters of coconut water per week
        int pulp = 300; // Required grams of coconut pulp per week
        int waterA = 200; // Milliliters of coconut water in type A coconut
        int pulpB = 150; // Grams of coconut pulp in type B coconut

        int total = calculateTotalCoconuts(water, pulp, waterA, pulpB);

        System.out.println("Chef should buy " + total + " coconuts each week.");
      }

    public static int calculateTotalCoconuts(int water, int pulp, int waterA, int pulpB) 
      {
        int coconutsA = (water + waterA - 1) / waterA;
        int coconutsB = (pulp + pulpB - 1) / pulpB;
        int totalCoconuts = coconutsA + coconutsB;
        return totalCoconuts;
      }
}
