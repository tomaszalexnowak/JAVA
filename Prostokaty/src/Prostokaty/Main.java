package Prostokaty;

public class Main {
	public static void main(String[] args) {
	
		// definicja wierzcho�k�w du�ego prostok�ta
		Punkt duzy_a = new Punkt(0,0);
		Punkt duzy_b = new Punkt(0,500);
		Punkt duzy_c = new Punkt(600,500);
		Punkt duzy_d = new Punkt(600,0);

		// definicja wierzcho�k�w ma�ego prostok�ta
		Punkt maly_a = new Punkt(0,0);
		Punkt maly_b = new Punkt(0,40);
		Punkt maly_c = new Punkt(40,40);
		Punkt maly_d = new Punkt(40,0);
		
		// definicja prostok�t�w - do test�w, nieistotna w dalszym ci�gu programu
		Prostokat duzy = new Prostokat(duzy_a,duzy_b,duzy_c,duzy_d);
		Prostokat maly = new Prostokat(maly_a,maly_b,maly_c,maly_d);
		
		// definicja linii na bazie wierzcho�k�w
		Linia Pozioma_linia = new Linia(duzy_a, duzy_b);
		Linia Pionowa_linia = new Linia(duzy_a, duzy_d);
		Linia Kwadrat = new Linia(maly_a, maly_b);
		
		int licznik = 0;
		double stala = Kwadrat.dlugoscOdcinka();
		double x = 0;
		double y = stala;
		
		while(y <= Pionowa_linia.dlugoscOdcinka())
		{
			while(x < Pozioma_linia.dlugoscOdcinka())
			{
				x += stala;
				licznik++;
			}
			y += stala;
			
			if(y <= Pionowa_linia.dlugoscOdcinka())
			{
				while(x > 0)
				{
					x -= stala;
					licznik++;
				}
			}
			x = 0;
			y += stala;	
		}
		System.out.println("Ilo�� umieszczonych zdj�� jest r�wna " + licznik + ".");
	}

}
