package zestaw1;

import java.util.Scanner;

public class Zadanie5 {

	public static void main(String[] args) {
		Scanner sprawdz = new Scanner(System.in);
		System.out.println("Podaj obliczenie: ");
		String obliczenie = sprawdz.nextLine();
		
		int nawias_otwarty = 0, nawias_zamkniety = 0;
				
		for(int i = 0; i < obliczenie.length(); i++)
		{
			if(obliczenie.charAt(i) == '(')
			{
				nawias_otwarty = nawias_otwarty + 1;
			}
			else if (obliczenie.charAt(i) == ')')
			{
				nawias_zamkniety = nawias_zamkniety + 1;
			}
			else
			{
				continue;
			}
		}
		
		if(nawias_otwarty == nawias_zamkniety)
		{
			System.out.println("Nawiasy siê zgadzaj¹");
		}
		else
		{
			System.out.println("Coœ jest nie tak");
		}
	}

}
