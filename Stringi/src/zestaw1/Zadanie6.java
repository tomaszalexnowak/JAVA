package zestaw1;

import java.util.Scanner;

public class Zadanie6 {

	public static void main(String[] args) {
		Scanner wyraz = new Scanner(System.in);
		System.out.println("Witaj w programie do cezarowania\nPodaj ³añcuch do zaszyfrowania:");
		String do_zamiany = wyraz.nextLine();
		System.out.println("Podaj o ile przesun¹æ znaki:");
		int krok = wyraz.nextInt();
		
		int [] zmienione = new int[do_zamiany.length()];
		
		for(int i = 0; i < do_zamiany.length(); i++)
		{
			char test = do_zamiany.charAt(i);
			int ascii = test + krok;
				if(ascii - krok == 32)
				{
					zmienione[i] = 32;
				}
				else if (ascii < 97)
				{
					zmienione[i] = ascii + 26;
				}
				else if (ascii > 122)
				{
					zmienione[i] = ascii - 26;
				}
				else
				{
					zmienione[i] = ascii;
				}
		}
		
		String koncowy;
		
		for(int i : zmienione)
		{
			koncowy = Character.toString((char) i);
			System.out.print(koncowy);
		}
	}
}
