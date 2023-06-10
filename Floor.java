/* Chef and Chefina are residing in a hotel.
   Floor 1 consists of room numbers 1 to 10.
   Floor 2 consists of room numbers 11 to 20.
   Floor i consists of room numbers 10⋅(i−1)+1 to 10⋅i.
	You know that Chef's room number is X while Chefina's Room number is Y.
	If Chef starts from his room, find the number of floors he needs to travel to reach Chefina's room.*/



import java.util.Scanner;
public class Floor 
{
    public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);
	  System.out.println("Enter the chefRoomNumber:");
	  int chefRoomNumber=s.nextInt();
	  System.out.println("Enter the chefinaRoomNumber:");
	  int chefinaRoomNumber=s.nextInt();
	  
	  int chefFloor = (chefRoomNumber - 1) / 10 + 1;
        int chefinaFloor = (chefinaRoomNumber - 1) / 10 + 1;
        int floorsToTravel = Math.abs(chefFloor - chefinaFloor);

        System.out.println("Chef needs to travel " + floorsToTravel + " floors to reach Chefina's room.");
    }
}
