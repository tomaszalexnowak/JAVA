package Prostokaty;

public class Punkt {

	private int x;
	private int y;
	
	public Punkt (int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void wypisz()
	{
		System.out.println("Punkt ma wsp�rz�dn� x = " + x + " oraz wsp�rz�dn� y = " + y + ".");
	}
}
