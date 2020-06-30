package Prostokaty;

public class Prostokat {
	private Punkt pktA;
	private Punkt pktB;
	private Punkt pktC;
	private Punkt pktD;

	public Punkt getPktA()
	{
		return pktA;
	}
	
	public void setPktA(Punkt pktA)
	{
		this.pktA = pktA;
	}
	
	public Punkt getPktB()
	{
		return pktB;
	}
	
	public void setPktB(Punkt pktA)
	{
		this.pktA = pktA;
	}
	
	public Punkt getPktC()
	{
		return pktC;
	}	
	public void setPktC(Punkt pktC)
	{
		this.pktC = pktC;
	}
	
	public Punkt getPktD()
	{
		return pktD;
	}
	
	public void setPktD(Punkt pktD)
	{
		this.pktD = pktD;
	}
	
	public Prostokat(Punkt pktA, Punkt pktB, Punkt pktC, Punkt pktD)
	{
		this.pktA = pktA;
		this.pktB = pktB;
		this.pktC = pktC;
		this.pktD = pktD;
	}
	
	public void wypiszProstokat()
	{
		System.out.println("Punkty w prostok¹cie wynosz¹:");
		pktA.wypisz();
		pktB.wypisz();
		pktC.wypisz();
		pktD.wypisz();
	}
}
