package Prostokaty;

public class Linia {
	Punkt pkt1, pkt2;
	
	Linia(Punkt p1, Punkt p2)
	{
		pkt1 = p1;
		pkt2 = p2;
	}
	
	public double dlugoscOdcinka()
	{
		return Math.sqrt(Math.pow((pkt1.getX() - pkt2.getX()), 2) + Math.pow((pkt1.getY() - pkt2.getY()), 2));
	}
	
	public void wypiszLinie()
	{
		pkt1.wypisz();
		pkt2.wypisz();
	}
}
