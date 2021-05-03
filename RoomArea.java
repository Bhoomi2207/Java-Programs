package JavaProgramsOfHBP;
class Room
{
	float lenght, breadth;
	void getdata(float a, float b)
	{
		lenght = a;
		breadth = b;
	}
}
public class RoomArea 
{
	public static void main(String[] args)
	{
		float area;
		Room room1 = new Room();  //create an object room1
		room1.getdata(20,10);
		area = room1.lenght * room1.breadth;
		System.out.println("The area of room: " + area);
	}
}
