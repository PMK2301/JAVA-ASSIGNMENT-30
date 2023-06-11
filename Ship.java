/*Write a program that takes in a letterclass ID of a ship and display the equivalent string class description of the given ID. Use the    	table below.

	Class ID	Ship Class

	B or b	BattleShip
	C or c	Cruiser
	D or d	Destroyer
	F or f	Frigate
*/

import java.util.Scanner;

public class Ship 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the letter class ID of the ship: ");
        char id = scanner.next().charAt(0);

        String description = "";
        if (Character.toLowerCase(id) == 'b') 
        {
            description = "BattleShip";
        } 
        else if (Character.toLowerCase(id) == 'c') 
        {
            description = "Cruiser";
        } 
        else if (Character.toLowerCase(id) == 'd') 
        {
            description = "Destroyer";
        }
        else if (Character.toLowerCase(id) == 'f') 
        {
            description = "Frigate";
        } 
        else 
        {
            description = "Unknown";
        }

        System.out.println("Ship Class: " + description);
    }
}

