package week10;

public class Automobile {
	
	private int doors = 4;
	private int cylinders = 4;
	private int gears = 6;
	private String color = "Black";
	private String name = "Car";
	
	public Automobile (int d, int c)
	{
		doors = d;
		cylinders = c;
	}
	
	public Automobile ( int d, int c, int g)
	{
		doors = d;
		cylinders = c;
		gears = g;
	}
	
	public Automobile (String col, int d, int c, int g)
	{
		color = col;
		doors = d;
		cylinders = c;
	}
	
	public Automobile (String n,String col, int d, int c, int g)
	{
		color = col;
		doors = d;
		cylinders = c;
		name = n;
	}
	
	public void SetNumberOfDoors(int d)
	{
		doors = d;
	}
	
	public void SetNumberOfCylinders(int c)
	{
		cylinders = c;
	}
	
	public void SetTransmission(int t)
	{
		gears = t;	
	}
	
	public void SetColor(String c)
	{
		color = c;
	}
		
	public void SetName(String n)
	{
		name = n;
	}
	
	public String About()
	{
		String about = ("Doors = " + doors);
		about = about + ("\nCylinders = " + cylinders);
		about = about + ("\nTransmission = " + gears + " gears");
		about = about + ("\nColor = " + color);
		about = about + ("\nName = " + name);
		
		return about;
		
	}
}
