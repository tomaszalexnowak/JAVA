package zestaw1;

import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) {		
		Scanner wpisane = new Scanner(System.in);
		System.out.println("Podaj wyrazenie:");
		String wyrazenie = wpisane.nextLine();
		
		System.out.println("Ostatnia litera to " + wyrazenie.substring(wyrazenie.length() - 1) + ".");
		
		char [] tablica = wyrazenie.toCharArray();
		char ostatnia = tablica[wyrazenie.length() - 1];
		
		int licznik = 1;
		
		for(int i = 0; i < wyrazenie.length() - 1 ; i++)
		{
			if(ostatnia == tablica[i])
			{
				licznik++;
			}
		}
		
		System.out.print("Liczba wyst¹pieñ litery " + ostatnia + ", to " + licznik + ".");
	}
}