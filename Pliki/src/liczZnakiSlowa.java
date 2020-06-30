import java.io.*;

public class liczZnakiSlowa {

	static void liczZnakiSlowa(String test) throws IOException{
		File plik = new File(test);
		FileInputStream strumien = new FileInputStream(plik);
		InputStreamReader podajka = new InputStreamReader(strumien);
		BufferedReader odczyt = new BufferedReader(podajka);
		
		char spacja = ' ';
		char tab = '\t';
		int biale_znaki=0;
		int litery = 0;
		int inne_znaki = 0;
		int slowa = 0;
		String linie;
		
		while((linie = odczyt.readLine()) != null)
		{
			for(int i = 0; i < linie.length(); i++)
			{
				if(tab == linie.charAt(i) || spacja == linie.charAt(i))
				{
					biale_znaki++;
				}
				else if(Character.isAlphabetic(linie.charAt(i)))
				{
					litery++;
				}
				else
				{
					inne_znaki++;
				}
			}
			biale_znaki++;
			String[] listaSlow = linie.split("\\s+");
			slowa += listaSlow.length;
		}
		int suma = biale_znaki + litery + inne_znaki;
		
		int[] wyniki = new int[]
				{biale_znaki,litery,inne_znaki,suma,slowa};
		
		System.out.println("Bia³e znaki: " + wyniki[0] +"."
				+ "\nLitery: " + wyniki[1] + "."
				+ "\nInne znaki: " + wyniki[2] + "."
				+ "\nSuma znaków: " + wyniki[3] + "."
				+ "\nIloœæ s³ów: " + wyniki[4] + ".");		
	}

	public static void main(String[] args) throws IOException {
		liczZnakiSlowa("C:\\test.txt");
	}

}
